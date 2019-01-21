# Write your MySQL query statement below
select name as Name from employee
where id in 
(select managerId from Employee
group by managerId
having count(managerId)>=5) 
