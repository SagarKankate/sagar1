package com.puretech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.puretech.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long>{

	Department findBydept_name(String deptName);

}
