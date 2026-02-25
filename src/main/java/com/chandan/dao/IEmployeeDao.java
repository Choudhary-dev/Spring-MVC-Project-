package com.chandan.dao;

import java.util.List;

import com.chandan.model.Employee;

public interface IEmployeeDao {
	
	public List<Employee> getAllEmloyee();
	public String insertEmployee(Employee e);
	public Employee getEmployeeByNo(int empno);
    public int updateEmployee(Employee e);
    public int deleteEmployeeByNo(int no);
}
