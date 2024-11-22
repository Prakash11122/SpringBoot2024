package com.it.pradhan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.pradhan.eitity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
