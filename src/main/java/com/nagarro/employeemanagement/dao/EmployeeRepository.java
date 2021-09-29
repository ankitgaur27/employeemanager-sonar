package com.nagarro.employeemanagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.nagarro.employeemanagement.entitites.Employee;


/**
 * This interface helps for CRUD operations
 * @author ankitgaur
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	
	
}
