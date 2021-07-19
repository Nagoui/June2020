# Write your MySQL query statement below
select employee.name as employee
    from employee as employee,
        employee as manager
    where employee.managerid = manager.id 
    and employee.salary > manager.salary;

