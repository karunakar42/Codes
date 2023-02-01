package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee_entity;
import com.employee.exception.EmployeeAlreadyExistsException;
import com.employee.exception.EmployeeNotExistsException;
import com.employee.repo.Employee_repo;

@Service
public class Employee_servImp implements Employee_Service{

	@Autowired
	private Employee_repo repo;

	@Override
	public String save(Employee_entity entity) throws EmployeeAlreadyExistsException{
		try {
			if (repo.existsById(entity.getEmp_id())) {
				throw new EmployeeAlreadyExistsException("Already exists");
			} else {
				repo.save(entity);
				return "Employee Saved";
			}
		} catch (EmployeeAlreadyExistsException e) {
			e.printStackTrace();
		}
		return "Already Exists";
	}

	@Override
	public String delete(int emp_Id) throws EmployeeNotExistsException{
		try {
			if (repo.existsById(emp_Id)) {
				repo.deleteById(emp_Id);
				return "Deleted the Employee data of id "+emp_Id;
			}else {
				throw new EmployeeNotExistsException("Not exists");
			}
		} catch (EmployeeNotExistsException e) {
			e.printStackTrace();
		}
		return "Employee Not exists with id "+emp_Id;
	}

	@Override
	public String update(Employee_entity entity) throws EmployeeNotExistsException{
		try {
			if (repo.existsById(entity.getEmp_id())) {
				repo.save(entity);
				return "Updated the Employee data of id "+entity.getEmp_id();
			}else {
				throw new EmployeeNotExistsException("Not exists");
			}
		} catch (EmployeeNotExistsException e) {
			e.printStackTrace();
		}
		return "Employee Not exists with id "+entity.getEmp_id();
	}

	@Override
	public Employee_entity find(int emp_id) throws EmployeeNotExistsException {
	try {
		if (repo.existsById(emp_id)) {
			return repo.findById(emp_id).get();
		} else {
			throw new EmployeeNotExistsException("Not Exists");
		}
	} catch (EmployeeNotExistsException e) {
		e.printStackTrace();
	}
		return null;
	}

	@Override
	public List<Employee_entity> findAll() {
			return repo.findAll();
	}

}
