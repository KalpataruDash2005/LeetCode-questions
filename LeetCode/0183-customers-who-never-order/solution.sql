# Write your MySQL query statement below
select name as Customers from customers where id not IN (select customerId from Orders); 
