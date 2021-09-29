package com.nagarro.employeemanagement.controller;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.employeemanagement.entitites.Employee;
import com.nagarro.employeemanagement.services.EmployeeService;

/**
 * This is controller class which is used to GET, POST, PUT
 * @author ankitgaur
 *
 */
@RestController
public class EmployeeController {
	
   private static List<Employee> list= new ArrayList<>();
	
   
   /**
    * it returns the JSON file of list of employees
    * @return
    */
	@GetMapping("/employees")
	public List<Employee> getEmployees() { 
		EmployeeService employeeService = new EmployeeService();
		list = employeeService.getAllEmployees();  
		return list;
	}
	
	/**
	 * This is used to Add a new employee
	 * @param employee
	 */
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee) { 
		EmployeeService employeeService = new EmployeeService();
		employeeService.addEmployee(employee);  
		System.out.println(employee);
	}
	
	
	/**
	 * This is used update the employee according to the ID
	 * @param employee
	 * @param employeeId
	 */
	@PutMapping("/employees/{employeeId}")
	public void addEmployee(@RequestBody Employee employee, @PathVariable("employeeId") int employeeId) { 
		EmployeeService employeeService = new EmployeeService();
		employeeService.updateEmployee(employee , employeeId);   
	}
	
	
}
