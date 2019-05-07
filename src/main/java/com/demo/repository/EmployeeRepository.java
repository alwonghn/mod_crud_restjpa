package com.demo.repository;

import com.demo.entity.Employee;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {

	List<Employee> findAll();
	
	Optional<Employee> findById(String username);
	
}
