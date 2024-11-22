package com.it.pradhan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.pradhan.eitity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
