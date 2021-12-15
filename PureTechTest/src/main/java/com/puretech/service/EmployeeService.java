package com.puretech.service;

import java.util.List;

import com.puretech.custome.exception.EmployeeNotSavedException;
import com.puretech.model.Employee;

public interface EmployeeService {

	String saveEmployee(Employee e) throws EmployeeNotSavedException;

	Long getCountOfEmployee(String deptName);

	String updateEmployee(String empid, Employee emp) throws EmployeeNotSavedException;

	List<Employee> getEmployeesByCity(String cityName) throws EmployeeNotSavedException;
	
	
}
