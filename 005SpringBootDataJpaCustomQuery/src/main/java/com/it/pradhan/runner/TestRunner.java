package com.it.pradhan.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.it.pradhan.entity.Book;
import com.it.pradhan.repo.BookRepository;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.saveAll(Arrays.asList(
				new Book(101, "SBMS", "RAGHU", 300.0, "Backend"),
				new Book(102, "CORE", "RAGHU", 200.0, "Backend"),
				new Book(103, "ADV", "ASHOK", 400.0, "Backend"),
				new Book(104, "REACT", "ASHOK", 500.0, "Frontend"),
				new Book(105, "HTML", "RAGHU", 600.0, "Frontend")));

	}

}
