package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.service.EmployeeService;

import com.demo.entity.Employee;

@RestController
public class LoginController {
	
	@Autowired
	private EmployeeService personService;
	
//    // GET Method for Read operation
//    @GetMapping("/person/{id}")
//    public ResponseEntity<Person> getPersonById(@PathVariable(value="id") Long personId) throws ResourceNotFoundException {
//        Car car = carRepository.findById(carId)
//                  .orElseThrow(() -> new ResourceNotFoundException("Car not found on :: " + carId));
//        return ResponseEntity.ok().body(car);
//    }
	
	
	
	
}