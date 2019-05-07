package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.demo.bean.Login;
import com.demo.entity.Employee;
import com.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> getAllEmployees(){
		return repository.findAll();
	}

//	public Employee validateUser(Login login) {
//		return repository.findById(login.getUsername()).get();
//	}
}