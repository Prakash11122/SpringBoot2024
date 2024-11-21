package com.it.pradhan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.pradhan.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
