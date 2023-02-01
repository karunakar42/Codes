package com.employee.service;

import java.util.List;

import com.employee.entity.Employee_entity;
import com.employee.exception.EmployeeAlreadyExistsException;
import com.employee.exception.EmployeeNotExistsException;

public interface  Employee_Service {

	String save(Employee_entity entity) throws EmployeeAlreadyExistsException;
	String delete(int emp_Id) throws EmployeeNotExistsException;
	String update(Employee_entity entity) throws EmployeeNotExistsException;
	Employee_entity find(int emp_id) throws EmployeeNotExistsException;
	List<Employee_entity> findAll();
}
