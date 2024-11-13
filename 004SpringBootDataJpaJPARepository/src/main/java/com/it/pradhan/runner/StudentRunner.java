package com.it.pradhan.runner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.it.pradhan.entity.Student;
import com.it.pradhan.repository.StudentRepo;

@Component
public class StudentRunner implements CommandLineRunner {
	
	@Autowired
	private StudentRepo repo;

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
		String s = sdf.format(new Date());
		System.out.println(s);
		
		
		Student s1 = new Student();
		s1.setStdName("prakash");
		s1.setStdFee(500.0);
		s1.setStdDoj(new Date());
		//repo.save(s1);
		
		List<Student> all = repo.findAll();
		System.out.println(all.getClass().getName());
		all.forEach(System.out::println);
		
		Student sob = new Student();
		sob.setStdFee(400.0);
		sob.setStdName("AJAY");
		Example<Student> prob = Example.of(sob);
		repo.findAll(prob).forEach(System.out::println);

	}

}
