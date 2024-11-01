package com.it.pradhan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestDataRunner implements CommandLineRunner {
	
	@Autowired
	private EmailConfig email;

	@Override
	public void run(String... args) throws Exception {
		email.setCode("Java");
		email.setPort(8080);
		System.out.println(email);
		System.out.println(email.getCode());

	}

}
