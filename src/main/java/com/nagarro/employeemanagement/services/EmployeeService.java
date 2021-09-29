package com.nagarro.employeemanagement.services;

import static com.nagarro.employeemanagement.EmployeemanagementmentApplication.context;

import java.util.List;
import java.util.Optional;

import com.nagarro.employeemanagement.dao.EmployeeRepository;
import com.nagarro.employeemanagement.entitites.Employee;

/**
 * This is a service class for READ, UPDATE, CREATE operation from database;
 * @author ankitgaur
 *
 */
public class EmployeeService {
	
	/**
	 * This return all the list of employees
	 * @return
	 */
	public List<Employee> getAllEmployees(){ 
		EmployeeRepository ep = context.getBean(EmployeeRepository.class); 
		return (List<Employee>) ep.findAll();
	}
	
	/**
	 * This function add the employee in the employee's table
	 * @param employee
	 */
	public void addEmployee(Employee employee){ 
		EmployeeRepository ep = context.getBean(EmployeeRepository.class); 
		ep.save(employee);
	}

	/**
	 * This function updates the Existing Employee
	 * @param employee
	 * @param employeeId
	 */
	public void updateEmployee(Employee employee, int employeeId) { 
		EmployeeRepository ep = context.getBean(EmployeeRepository.class); 
		Optional<Employee> optional =  ep.findById(employeeId);
		Employee employee2 =  optional.get();
		ep.save(employee);
	}
}
