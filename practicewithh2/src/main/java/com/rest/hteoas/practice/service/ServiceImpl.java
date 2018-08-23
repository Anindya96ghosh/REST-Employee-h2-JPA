package com.rest.hteoas.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.hteoas.practice.EmployeeRepository;
import com.rest.hteoas.practice.exception.EmployeeNotFound;
import com.rest.hteoas.practice.pojo.Employee;

@Component
public class ServiceImpl implements Service {
	
	@Autowired
	EmployeeRepository dao;
	
	@Override
	
	public void addNewEmployee(Employee emp) {
		
		dao.save(emp);
	}

	@Override
	public List<Employee> viewAllEmployee() {

		return dao.findAll();
	}

	@Override
	public void deleteEmployee(int empId) {
		
		dao.deleteById(empId);
		
	}

	public void updateEmployee(Employee emp) throws EmployeeNotFound {
		dao.save(emp);
	}

	public Employee searchEmployee(int empId) {
		
		return dao.findById(empId).get();
	}

}
