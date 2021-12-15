package com.puretech.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puretech.custome.exception.EmployeeNotSavedException;
import com.puretech.model.Department;
import com.puretech.model.Employee;
import com.puretech.repository.DepartmentRepo;
import com.puretech.repository.EmployeeRepo;
import com.puretech.service.EmployeeService;

import ch.qos.logback.classic.Logger;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	EmployeeRepo emplyeerepo;

	@Autowired
	DepartmentRepo deptRepo;

	org.slf4j.Logger logger = LoggerFactory.getLogger(EmployeeServiceImplementation.class);

	@Override
	public String saveEmployee(Employee e) throws EmployeeNotSavedException {
		try {
			emplyeerepo.save(e);
			logger.info("Employee saved Sucessfully");
			return "Employee Saved Sucessfully";

		} catch (Exception exp) {
			exp.printStackTrace();
			logger.error("Employee Not Saved due to" + exp.getMessage());
			throw new EmployeeNotSavedException(exp.getMessage(), "404");
		}

	}

	@Override
	public Long getCountOfEmployee(String deptName) {

		logger.debug("Executing the getCountOfEmployee... ");
		try {
			logger.info("Executing getCountOfEmployee with Dept Name" + deptName);
			Department d = deptRepo.findBydept_name(deptName);
			return emplyeerepo.countBydept(d);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Excetpion in the getCountOfEmployee :- ", e);

			return 0L;

		}

	}

	@Override
	public String updateEmployee(String empId, Employee emp) throws EmployeeNotSavedException {
		logger.debug("Executing the updateEmployee... ");
		try {
			Optional<Employee> e = emplyeerepo.findById(empId);

			if (e.isPresent()) {

				emplyeerepo.save(emp);
				return "Employee Update Sucessfully";
			} else {
				logger.error("Excetpion in the updateEmployee :- ", e);
				throw new EmployeeNotSavedException("employee Not Found with this id", "404");
			}
		} catch (Exception e) {
			logger.error("Excetpion in the updateEmployee :- ", e);
			throw new EmployeeNotSavedException("employee Not update", "404");
		}

	}

	@Override
	public List<Employee> getEmployeesByCity(String cityName) throws EmployeeNotSavedException {
		try {
			logger.debug("Executing the getEmployeesByCity... ");
			List<Employee> empList = emplyeerepo.findBycity(cityName);

			return empList;
		} catch (Exception e) {
			logger.error("Excetpion in the getEmployeesByCity :- ", e);
			throw new EmployeeNotSavedException("something went wrong, please try again", "404");
		}

	}

}
