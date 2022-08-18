package com.mindgate.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.pojo.Employee;


public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		int employeeId = rs.getInt("employee_Id");
		String name = rs.getString("name");
		double salary = rs.getDouble("salary");
		
		Employee employee = new Employee(employeeId, name, salary);
		
		return employee;
	}
	

}