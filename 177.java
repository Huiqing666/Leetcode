CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN

    Set N=N-1;    
  RETURN (
      # Write your MySQL query statement below.
      Select DISTINCT Salary
      From Employee
      Order by Salary Desc Limit N, 1
      
  );
END
