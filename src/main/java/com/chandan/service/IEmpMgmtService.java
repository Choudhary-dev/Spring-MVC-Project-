package com.chandan.service;

import java.util.List;

import com.chandan.model.Employee;

public interface IEmpMgmtService {
	
	public List<Employee> fetchAllEmployee();
	public String addEmployee(Employee emp);
	public Employee fetchEmployee(int no);
	public String modifyEmployee(Employee emp);
	public String removeEmployee(int no);

}
