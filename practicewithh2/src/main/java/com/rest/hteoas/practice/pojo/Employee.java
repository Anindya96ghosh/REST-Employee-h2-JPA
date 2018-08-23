package com.rest.hteoas.practice.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.hateoas.ResourceSupport;

@Entity
public class Employee extends ResourceSupport {
	
	
	@Id
	private int empId;
	private String empName;

	private double empSalary;
	

	public Employee() {
		
	}
	
	
	public Employee(int empId2, String empName2, double empSalary2) {
		this.empId=empId2;
		this.empName=empName2;
		this.empSalary=empSalary2;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public void setEmpID(int empId) {
		this.empId = empId;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}


	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
	public double getEmpSalary() {
		return empSalary;
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary + "]";
	}

	}
