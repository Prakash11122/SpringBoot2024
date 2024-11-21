package com.it.pradhan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.pradhan.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
