package com.chandan.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.chandan.model.Employee;

@Repository("empDao")
public class EmployeeDaoImpl implements  IEmployeeDao{
	
	private static final String  GET_ALL_EMP="select * from emp";
    private static final String ADD_EMP="insert into emp(empno, ename, esal, job, deptno) values (emp_no_seq.NEXTVAL,?,?,?,?)";
    private static final String GET_EMP_NO="select * from emp where empno= ?";
    private static final String UPD_EMP="update emp set ename =  ? , esal = ? ,job = ? , deptno = ? where empno = ?";
    private static final String DEL_EMP="delete from emp where empno = ? ";
	@Autowired
	private DataSource ds;
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<Employee> getAllEmloyee() {
		// TODO Auto-generated method stub
		
		   List<Employee> list = jt.query(GET_ALL_EMP, (rs)->{
			   
			   List<Employee> li = new ArrayList<>();
			   
			   while(rs.next()) {
			   Employee e = new Employee();
			 
			   e.setEmpno(rs.getInt(1));
			   e.setEname(rs.getString(2));
			   e.setEsal(rs.getFloat(3));   // ✔ correct
			   e.setJob(rs.getString(4));   // ✔ correct
			   e.setDeptNo(rs.getInt(5));
			   
			   li.add(e);
			   }
			   
			   return li;
			   
		   });
		return list;
	}

	@Override
	public String insertEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		int c = jt.update(ADD_EMP,e.getEname(),e.getEsal(),e.getJob(),e.getDeptNo());
		
		
		return c==1? "employee registered":"employy not registered";
	}

	@Override
	public Employee getEmployeeByNo(int empno) {
		// TODO Auto-generated method stub
		
		Employee e= jt.queryForObject(GET_EMP_NO,(r,no)->{
			
			        Employee e1 = new Employee();
			        
			        e1.setEmpno(r.getInt(1));
			        e1.setEname(r.getString(2));
					   e1.setEsal(r.getFloat(3));   // ✔ correct
					   e1.setJob(r.getString(4));   // ✔ correct
					   e1.setDeptNo(r.getInt(5));
					   
			        
			        
			        return e1;
			
		},empno);
		
		return e;
	}

	@Override
	public int updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		
		int r = jt.update(UPD_EMP,e.getEname(),e.getEsal(),e.getJob(),e.getDeptNo(),e.getEmpno());
		return r;
	}

	@Override
	public int deleteEmployeeByNo(int no) {
		// TODO Auto-generated method stub
		int r = jt.update(DEL_EMP,no);
		return r;
	}

}
