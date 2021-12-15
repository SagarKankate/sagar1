package com.puretech.custome.exception;


public class EmployeeNotSavedException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9147180177066106897L;
	
	
	private String message;
	private String errorCode;
	
	public EmployeeNotSavedException(Exception e) {
	}
	
	public EmployeeNotSavedException(String message, String errorCode) {
		super();
		this.message = message;
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	

}
