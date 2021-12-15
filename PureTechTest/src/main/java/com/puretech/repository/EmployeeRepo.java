package com.puretech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.puretech.model.Department;
import com.puretech.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String>  {

	
	public Long countBydept(Department d);

	public List<Employee> findBycity(String cityName);
}
