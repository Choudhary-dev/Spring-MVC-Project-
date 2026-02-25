package com.chandan.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.chandan.model.Employee;
import com.chandan.service.IEmpMgmtService;

@Controller
public class EmployeeController {
	
	@Autowired
	private IEmpMgmtService service;
	
	@GetMapping("/")
	public String showHomePage() { 
		
		return "home";
		
	}
	
	@GetMapping("/report")
	public String showReport(Map<String,Object> mp) { 
		
		List<Employee> list = service.fetchAllEmployee();
		
		mp.put("list", list);
		
		return "report";
	}

	@GetMapping("/add_employee")
	public String addEmployee(@ModelAttribute("emp") Employee emp) {
		
		
		return "register_emp_form"; 
		
	}
	
	@PostMapping("/add_employee")
	public String processAddEmp(@ModelAttribute("emp") Employee emp,RedirectAttributes attrs)// Map<String,Object> mp) {
	{
		String ms= service.addEmployee(emp);
		
		List<Employee> li = service.fetchAllEmployee();
		
		attrs.addFlashAttribute("ans", ms);
		attrs.addFlashAttribute("list", li);
		
		return "redirect:/report";
		
	
		
		
	}
	
	@GetMapping("/edit_employee")
	public String showEditEmployeePage(@RequestParam("no") int no,@ModelAttribute("emp") Employee emp ) { 
		
		Employee e = service.fetchEmployee(no);
		
		BeanUtils.copyProperties(e, emp);
	
		
		return "edit_employee_form";
		
	}
	
	@PostMapping("/edit_employee")
	public String EditEmployeePage(@ModelAttribute("emp") Employee emp ,Map<String,Object>mp) { 
		
		String msg = service.modifyEmployee(emp);
		

	
		List<Employee> list = service.fetchAllEmployee();
		
		mp.put("msg", msg);
		mp.put("list", list);
		return "report";
		
	}
	
	@GetMapping("/delete_employee")
	public String fireEmployee(@RequestParam("no") int no,Map<String,Object> mp) { 
		
		String m = service.removeEmployee(no);
		
		List<Employee> list = service.fetchAllEmployee();
		
		mp.put("msg1", m);
		mp.put("list", list);
		
		return "report";
		
		
		
		
	}
}
