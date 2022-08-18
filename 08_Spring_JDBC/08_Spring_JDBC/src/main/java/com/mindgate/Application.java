package com.mindgate;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		

		boolean result = employeeService.deleteEmployee(45);
		if (result)
			System.out.println("Deleted Succesfully");
		else
			System.out.println("Failed to delete");

		
		
//		Employee employee = new Employee(45, "Update value", 900);
//
//		boolean result = employeeService.updateEmployee(employee);
//		if (result)
//			System.out.println("Updated Succesfully");
//		else
//			System.out.println("Failed to insert");

//		AddNewEmployee code
//		Employee  employee = new Employee(45, "New value", 100);
//		
//		boolean result = employeeService.addNewEmployee(employee);
//		if(result)
//			System.out.println("Added Succesfully"); 
//		else
//			System.out.println("Failed to insert");

//		getOne code
//		Employee employee = employeeService.getEmployeeByEmployeeId(76);
//		
//		System.out.println(employee);

//		Selectall code
		List<Employee> allEmployees = employeeService.getAllEmployees();

		for (Employee e : allEmployees) {
			System.out.println(e);
		}

	}

}
