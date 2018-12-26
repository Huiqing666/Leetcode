# Write your MySQL query statement below
Select Department.Name as Department, Employee.Name as Employee, Employee.Salary as Salary
From Employee, Department
where Department.Id = Employee.DepartmentId
and Employee.Salary=(Select max(Salary) from Employee e2 where e2.DepartmentId=Department.Id)
