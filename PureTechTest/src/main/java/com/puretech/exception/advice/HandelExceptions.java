package com.puretech.exception.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.puretech.custome.exception.EmployeeNotSavedException;

@RestControllerAdvice
public class HandelExceptions {

	@ExceptionHandler
	public EmployeeNotSavedException handelEmployeeNotSaved(EmployeeNotSavedException e) {

		EmployeeNotSavedException es = new EmployeeNotSavedException(e);
		es.setMessage(e.getMessage());
		es.setErrorCode(e.getErrorCode());

		return es;
	}

}
