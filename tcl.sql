CREATE TABLE employeeee (
    employee_id SERIAL PRIMARY KEY,
    employee_name VARCHAR(100),
    opening_amount NUMERIC(10,2) DEFAULT 5000,
    bonus NUMERIC(10,2) DEFAULT 1000
);
ALTER TABLE employee
ADD COLUMN opening_amount NUMERIC(10,2) DEFAULT 5000;

ALTER TABLE employee
ADD COLUMN bonus NUMERIC(10,2) DEFAULT 1000;

INSERT INTO employee
(emp_id, employee_name, opening_amount, bonus)
VALUES
(1, 'Surya', 5000, 1000);


SELECT * FROM employee;
 BEGIN;
 SAVEPOINT sp1;
 
 UPDATE employee
SET bonus = 2000
WHERE emp_id = 1;

ROLLBACK TO SAVEPOINT sp1;

commit;