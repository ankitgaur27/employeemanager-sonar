package com.nagarro.employeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/**
 * This is Class which runs at the start of the project
 * @author ankitgaur
 *
 */
@SpringBootApplication
public class EmployeemanagementmentApplication {
	public static ApplicationContext context;
	public static void main(String[] args) {
		context = SpringApplication.run(EmployeemanagementmentApplication.class, args);
	}
}
