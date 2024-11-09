package com.it.pradhan.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.it.pradhan.entity.Employee;

public interface EmployeeRepo extends PagingAndSortingRepository<Employee, Integer>{

}
