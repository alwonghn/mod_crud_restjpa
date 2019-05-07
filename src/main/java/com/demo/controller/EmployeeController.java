/*
 * Copyright notice: Copyright (c) 2019 ABC Corp, All Rigts Reserved
 * This software is the confidential and proprietary information..
 * ABC makes no representations or warranties....
 */
package com.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.demo.entity.Employee;
import com.demo.service.EmployeeService;

/**
 * Class: EmployeeController
 * @version 0.0.1.RELEASE
 * @author alfred *
 */
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * Get all users list.
	 * @return the list
	 */
//	@ApiOperation(value = "Fetches all cars in the database.", response = Employee.class)
	
	@GetMapping("/employees")
	public List<Employee> getAllUsers() {
		return employeeService.getAllEmployees();
	}
	
	
}
