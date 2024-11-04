package com.it.pradhan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.it.pradhan.entity.Student;
import com.it.pradhan.repository.StudentRepository;

@Component
public class TestOprRunner implements CommandLineRunner{
	
	@Autowired
	private StudentRepository srepo;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(srepo.getClass().getName());
		
		Student s = new Student();
		s.setStudentId(10);
		s.setStudentName("prakash");
		s.setStudentFee(1000.0);
		
		srepo.save(s);
		
		
	}

}
