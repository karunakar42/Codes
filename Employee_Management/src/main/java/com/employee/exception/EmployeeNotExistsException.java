package com.employee.exception;

public class EmployeeNotExistsException extends Exception {
	private String Message;
	public EmployeeNotExistsException(String message) {
		this.Message=message;
	}
}
