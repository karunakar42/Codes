package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.entity.Employee_entity;
import com.employee.exception.EmployeeAlreadyExistsException;
import com.employee.exception.EmployeeNotExistsException;
import com.employee.service.Employee_Service;

@Controller
@RequestMapping("/employee/data/")
@CrossOrigin("*")
public class Employee_Controller {

	@Autowired
	private Employee_Service serv;
	
	@PostMapping("/")
	public ResponseEntity<String> save (@RequestBody Employee_entity entity) throws EmployeeAlreadyExistsException{
		return new ResponseEntity<String>(serv.save(entity),HttpStatus.OK);
	}
	
	@PutMapping("/")
	public ResponseEntity<String> update(@RequestBody Employee_entity entity) throws EmployeeNotExistsException {
		return new ResponseEntity<String>(serv.update(entity),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee_entity> find(@PathVariable("id") int id) throws EmployeeNotExistsException{
		return new ResponseEntity<Employee_entity>(serv.find(id),HttpStatus.OK);
	}
	
	@GetMapping("/")
		public ResponseEntity<List<Employee_entity>> findAll(){
			return new ResponseEntity<List<Employee_entity>>(serv.findAll(),HttpStatus.OK);
	}
}
