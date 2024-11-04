package com.it.pradhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.pradhan.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
