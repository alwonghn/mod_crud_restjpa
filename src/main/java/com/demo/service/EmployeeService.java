package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
//import com.demo.bean.Login;
import com.demo.entity.Employee;

@Service
public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	
//	Employee validateUser(Login login);
	
}