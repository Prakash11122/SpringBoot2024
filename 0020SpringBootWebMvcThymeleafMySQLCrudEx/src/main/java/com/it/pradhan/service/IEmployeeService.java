package com.it.pradhan.service;

import java.util.List;

import com.it.pradhan.entity.Employee;

public interface IEmployeeService {
	
	Integer saveEmployee(Employee e);
	
	void updateEmployee(Employee e);
	
	void deleteEmployee(Integer id);
	
	Employee getOneEmployee(Integer id);
	
	List<Employee> getAllEmployees();

}
