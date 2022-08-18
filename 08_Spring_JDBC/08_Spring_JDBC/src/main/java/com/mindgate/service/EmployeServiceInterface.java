package com.mindgate.service;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeServiceInterface {
	boolean addNewEmployee(Employee employee);
	boolean updateEmployee(Employee employee);
	boolean deleteEmployee(int employeeId);
	Employee getEmployeeByEmployeeId(int employeeId);
	List<Employee> getAllEmployees();
}

