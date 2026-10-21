CREATE DATABASE employee_db;
CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100),
    salary NUMERIC(10,2)
);
CREATE OR REPLACE FUNCTION check_salary_insert()
RETURNS TRIGGER
LANGUAGE plpgsql
AS $$
BEGIN
    IF NEW.salary < 10000 THEN
        NEW.salary := 10000;
    END IF;

    RETURN NEW;
END;
$$;
CREATE TRIGGER before_employee_insert
BEFORE INSERT ON employee
FOR EACH ROW
EXECUTE FUNCTION check_salary_insert();

CREATE OR REPLACE FUNCTION check_salary_update()
RETURNS TRIGGER
LANGUAGE plpgsql
AS $$
BEGIN
    IF NEW.salary < 10000 THEN
        RAISE EXCEPTION
        'Error: Salary cannot be less than 10000';
    END IF;

    RETURN NEW;
END;
$$;

CREATE TRIGGER before_employee_update
BEFORE UPDATE ON employee
FOR EACH ROW
EXECUTE FUNCTION check_salary_update();


CREATE OR REPLACE FUNCTION insert_employee(
    p_id INT,
    p_name VARCHAR(100),
    p_salary NUMERIC(10,2)
)
RETURNS VOID
LANGUAGE plpgsql
AS $$
BEGIN
    INSERT INTO Employee (emp_id, emp_name, salary)
    VALUES (p_id, p_name, p_salary);
END;
$$;

SELECT insert_employee(101, 'Surya', 8000);

SELECT * FROM Employee;


CREATE OR REPLACE FUNCTION update_employee_salary(
    p_id INT,
    p_salary NUMERIC(10,2)
)
RETURNS VOID
LANGUAGE plpgsql
AS $$
BEGIN
    UPDATE Employee
    SET salary = p_salary
    WHERE emp_id = p_id;

    IF NOT FOUND THEN
        RAISE NOTICE 'Employee ID not found';
    END IF;
END;
$$;


SELECT update_employee_salary(101, 25000);


SELECT * FROM Employee;



SELECT update_employee_salary(101, 5000)