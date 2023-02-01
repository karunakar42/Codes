package com.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee_entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int emp_id;
	private String first_Name;
	private String last_name;
	private float salary;
	public Employee_entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee_entity(int emp_id, String first_Name, String last_name, float salary) {
		super();
		this.emp_id = emp_id;
		this.first_Name = first_Name;
		this.last_name = last_name;
		this.salary = salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
