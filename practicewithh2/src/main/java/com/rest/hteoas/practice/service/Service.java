package com.rest.hteoas.practice.service;

import java.util.List;

import com.rest.hteoas.practice.pojo.Employee;

public interface Service {

	public void addNewEmployee(Employee emp);
	public List<Employee> viewAllEmployee();
	public void deleteEmployee(int empId);
}
