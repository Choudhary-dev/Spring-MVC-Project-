package com.chandan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandan.dao.IEmployeeDao;
import com.chandan.model.Employee;

@Service("empService")
public class EmpMgmtServiceimpl implements IEmpMgmtService{

	@Autowired
	private IEmployeeDao emDao;
	@Override
	public List<Employee> fetchAllEmployee() {
		// TODO Auto-generated method stub
		return emDao.getAllEmloyee();
	}
	@Override
	public String addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return emDao.insertEmployee(emp);
	}
	@Override
	public Employee fetchEmployee(int no) {
		// TODO Auto-generated method stub
		return emDao.getEmployeeByNo(no);
	}
	@Override
	public String modifyEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return emDao.updateEmployee(emp)==1?"employee updated":"employee not updated";
	}
	@Override
	public String removeEmployee(int no) {
		// TODO Auto-generated method stub
		int cnt = emDao.deleteEmployeeByNo(no);
		return cnt == 1? "emp deleted":"emp not found";
	}

}
