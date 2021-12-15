package com.puretech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puretech.custome.exception.EmployeeNotSavedException;
import com.puretech.model.Employee;
import com.puretech.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/save/employee")
	public String saveEmployee(@RequestBody Employee e) throws EmployeeNotSavedException {
		return employeeService.saveEmployee(e);
	}

	@GetMapping("/count/{dept}")
	public Long getContOfEmployeesByDepartment(@PathVariable("dept") String deptName) {
		return employeeService.getCountOfEmployee(deptName);
	}

	@PutMapping("/update/{empid}")
	public String updateEmployee(@PathVariable("empid") String empid,@RequestBody Employee emp) throws EmployeeNotSavedException {
		return employeeService.updateEmployee(empid,emp);
	}
	
	@GetMapping("/city/{cityName}")
	public List<Employee> getEmployeeByCity(@PathVariable("cityName") String cityName) throws EmployeeNotSavedException{
		return employeeService.getEmployeesByCity(cityName);
	}

}
