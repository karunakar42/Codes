package com.employee.exception;

public class EmployeeAlreadyExistsException extends Exception {
	private String message;
	public EmployeeAlreadyExistsException(String message) {
		this.message=message;
	}
}
