package com.rest.hteoas.practice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.hteoas.practice.pojo.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
