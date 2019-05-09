package com.demo.repository;

import com.demo.entity.Employee;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface EmployeeRepository extends CrudRepository<Employee, String> {

	List<Employee> findAll();
	
	Optional<Employee> findById(String username);
	
}
