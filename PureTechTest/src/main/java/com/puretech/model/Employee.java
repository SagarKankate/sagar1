package com.puretech.model;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import com.sun.istack.NotNull;

@Entity
public class Employee {
	@Id
	private Long employee_id;
	@NotNull
	private String first_name;
	@NotNull
	private String last_name;
	private String city;
	@NotNull
	private int age;
	private double salary;
	@NotNull
	private Department dept;
	
	public Long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", city=" + city + ", age=" + age + ", salary=" + salary + ", dept=" + dept + "]";
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Employee(Long employee_id, String first_name, String last_name, String city, int age, double salary,
			Department dept) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.city = city;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
	}
	
	
	

}
