package com.it.pradhan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.it.pradhan.entity.Role;
import com.it.pradhan.entity.User;
import com.it.pradhan.repository.RoleRepo;
import com.it.pradhan.repository.UserRepo;

@Component
public class TestDataInsertRunner implements CommandLineRunner {

	@Autowired
	private UserRepo urepo;
	
	@Autowired
	private RoleRepo rrepo;

	@Override
	public void run(String... args) throws Exception {

		Role r1 = new Role(503, "ADMIN");
		Role r2 = new Role(504, "GUEST");

		rrepo.save(r1);
		rrepo.save(r2);

		User u1 = new User(10, "SYED", r1);
		User u2 = new User(11, "SAM", r2);

		urepo.save(u1);
		urepo.save(u2);

	}

}
