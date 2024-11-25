package com.it.pradhan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.it.pradhan.entity.Product;
import com.it.pradhan.repository.ProductRepo;
@Component
public class TestDataRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepo prepo;

	@Override
	public void run(String... args) throws Exception {
		
		
	prepo.save(new Product(101, "AA", 200.0));
	System.out.println("___________________________");
	int count = prepo.updateNameById("PEN", 101);
	System.out.println(count);
	
	
	
	int removeById = prepo.removeById(101);
	System.out.println(removeById);
	

	}

}
