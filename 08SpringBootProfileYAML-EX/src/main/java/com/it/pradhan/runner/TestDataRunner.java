package com.it.pradhan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.it.pradhan.dbcon.MyDbConnection;

@Component
public class TestDataRunner implements CommandLineRunner {
	
	@Autowired
	private MyDbConnection mdc;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(mdc);

	}

}
