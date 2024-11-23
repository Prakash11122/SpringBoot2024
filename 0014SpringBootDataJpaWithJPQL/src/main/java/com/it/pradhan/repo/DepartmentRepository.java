package com.it.pradhan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.pradhan.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	

}
