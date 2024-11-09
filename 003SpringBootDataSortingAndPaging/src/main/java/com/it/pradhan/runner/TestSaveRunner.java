package com.it.pradhan.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.it.pradhan.entity.Employee;
import com.it.pradhan.repo.EmployeeRepo;

@Component
public class TestSaveRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepo repo;

	@Override
	public void run(String... args) throws Exception {
		
		 List<Employee> employees = Arrays.asList(
				    new Employee(1, "John Doe", 50000.0, "Engineering"),
		            new Employee(2, "Jane Smith", 60000.0, "Marketing"),
		            new Employee(3, "Alice Johnson", 55000.0, "Sales"),
		            new Employee(4, "Robert Brown", 45000.0, "Support")
		            );
		 
		 repo.saveAll(employees);
		 System.out.println("Multiple Employees have been saved.");
	
	}

}
