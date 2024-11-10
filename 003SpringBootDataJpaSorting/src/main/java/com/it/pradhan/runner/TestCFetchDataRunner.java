package com.it.pradhan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import com.it.pradhan.repo.EmployeeRepository;

@Component
public class TestCFetchDataRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;

	public void run(String... args) throws Exception {
		// 1. select * from employee order by esal ASC
		// use static method by() present in Sort class.
		repo.findAll(Sort.by("empSal")).forEach(System.out::println);
		
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");

		// select * from employee order by esal desc;
		repo.findAll(Sort.by(Direction.DESC, "empSal")).forEach(System.out::println);
		
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
		
		 //select * from employee order by esal, dept ;  //both asc

		repo.findAll(Sort.by("empSal","empDept")).forEach(System.out::println);
		
		
		
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
		
		repo.findAll(Sort.by(Direction.DESC,"empSal","empDept")).forEach(System.out::println);
		
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
		
		//4. select * from employee order by esal ASC, dept DESC;
		
		repo.findAll(Sort.by(Order.asc("empSal"),Order.desc("empDept"))).forEach(System.out::println);

	}

}