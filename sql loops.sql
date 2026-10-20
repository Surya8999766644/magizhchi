CREATE TABLE IF NOT EXISTS attendance (
    attendance_id SERIAL PRIMARY KEY,
    emp_id INT,
    attendance_date DATE,
    status TEXT
);

INSERT INTO attendance (emp_id, attendance_date, status)
VALUES
(101, '2026-10-19', 'Present'),
(101, '2026-10-20', 'Absent'),
(101, '2026-10-21', 'Absent'),
(102, '2026-10-20', 'Present'),
(102, '2026-10-21', 'Absent');

CREATE OR REPLACE PROCEDURE count_absent_days()
LANGUAGE plpgsql
AS $$
DECLARE
    rec RECORD;
    total INT;
BEGIN
    FOR rec IN
        SELECT DISTINCT emp_id FROM attendance
    LOOP
        SELECT COUNT(*)
        INTO total
        FROM attendance
        WHERE emp_id = rec.emp_id
          AND status = 'Absent';

        RAISE NOTICE 'Employee: %, Absent: %',
            rec.emp_id, total;
    END LOOP;
END;
$$;

CALL count_absent_days();




CREATE OR REPLACE FUNCTION update_attendance()
RETURNS VOID
LANGUAGE plpgsql
AS $$
BEGIN
    UPDATE attendance
    SET status = 'Present'
    WHERE status = 'Late';
END;
$$;

SELECT update_attendance();

SELECT emp_id,
       COUNT(*) FILTER (WHERE status = 'Absent') AS absent_days,
       CASE
           WHEN COUNT(*) FILTER (WHERE status = 'Absent') <= 2
               THEN 'Good'
           WHEN COUNT(*) FILTER (WHERE status = 'Absent') BETWEEN 3 AND 5
               THEN 'Average'
           ELSE 'Poor'
       END AS attendance_summary
FROM attendance
GROUP BY emp_id;



CREATE TABLE IF NOT EXISTS books (
    book_id SERIAL PRIMARY KEY,
    title TEXT,
    author TEXT,
    copies INT
);

CREATE OR REPLACE FUNCTION issue_book(id INT)
RETURNS TEXT
LANGUAGE plpgsql
AS $$
BEGIN
    UPDATE books
    SET copies = copies - 1
    WHERE book_id = id AND copies > 0;

    IF FOUND THEN
        RETURN 'Book Issued';
    ELSE
        RETURN 'Book Not Available';
    END IF;
END;
$$;

SELECT issue_book(1);


ALTER TABLE books
ADD COLUMN IF NOT EXISTS status TEXT;

CREATE OR REPLACE PROCEDURE update_book_status()
LANGUAGE plpgsql
AS $$
DECLARE
    rec RECORD;
BEGIN
    FOR rec IN
        SELECT book_id, copies FROM books
    LOOP
        IF rec.copies = 0 THEN
            UPDATE books
            SET status = 'Out of Stock'
            WHERE book_id = rec.book_id;
        END IF;
    END LOOP;
END;
$$;

CALL update_book_status();


SELECT book_id, title, copies,
       CASE
           WHEN copies > 5 THEN 'Available'
           WHEN copies BETWEEN 1 AND 5 THEN 'Limited'
           WHEN copies = 0 THEN 'Out of Stock'
           ELSE 'Invalid Copies'
       END AS availability_status
FROM books;


CREATE OR REPLACE FUNCTION check_book_availability(p_book_id INT)
RETURNS TEXT
LANGUAGE plpgsql
AS $$
DECLARE
    book_copies INT;
BEGIN
    SELECT copies
    INTO book_copies
    FROM books
    WHERE book_id = p_book_id;

    IF NOT FOUND THEN
        RETURN 'Book Not Found';
    ELSIF book_copies > 0 THEN
        RETURN 'Available';
    ELSE
        RETURN 'Not Available';
    END IF;
END;
$$;

SELECT check_book_availability(1);