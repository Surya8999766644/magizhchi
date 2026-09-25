CREATE TABLE orders (
    order_id INT,
    customer_id INT,
    amount DECIMAL(10,2)
);

INSERT INTO orders VALUES
(1, 101, 1000),
(2, 102, 3000),
(3, 103, 2000),
(4, 104, 5000);

SELECT order_id, customer_id, amount
FROM orders
WHERE amount > (
    SELECT AVG(amount)
    FROM orders
);