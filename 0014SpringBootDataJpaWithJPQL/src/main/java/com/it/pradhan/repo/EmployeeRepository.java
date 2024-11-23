package com.it.pradhan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.it.pradhan.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	@Query("SELECT emp.empName, dept.deptName FROM Employee emp INNER JOIN emp.dob as dept")
	List<Object[]> getEnameDeptNames();

}
