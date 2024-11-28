package com.it.pradhan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.pradhan.entity.Employee;
import com.it.pradhan.repo.EmployeeRepository;
import com.it.pradhan.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private EmployeeRepository repo;

	
	public Integer saveEmployee(Employee e) {
		e = repo.save(e);
		return e.getEmpId();
	}

	@Override
	public void updateEmployee(Employee e) {
		repo.save(e);
		
	}

	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		Optional<Employee> byId = repo.findById(id);
		
		return byId.get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = repo.findAll();
		
		return list;
	}

}
