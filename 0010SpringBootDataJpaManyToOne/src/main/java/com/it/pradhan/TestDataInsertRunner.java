package com.it.pradhan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.it.pradhan.entity.Department;
import com.it.pradhan.entity.Employee;
import com.it.pradhan.repo.DepartmentRepo;
import com.it.pradhan.repo.EmployeeRepo;


@Component
public class TestDataInsertRunner implements CommandLineRunner {
	
	@Autowired
	private DepartmentRepo drepo;
	
	@Autowired
	private EmployeeRepo erepo;

	@Override
	public void run(String... args) throws Exception {
		
		
		Department d1 = new Department(1054,"DEV","AJAY");
		drepo.save(d1);
		
		
		Employee e1 = new Employee(10, "SAM", 500.0, d1);
		Employee e2 = new Employee(11, "RAM", 600.0, d1);
		Employee e3 = new Employee(12, "SYED", 700.0, d1);
		
		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);

	}

}
