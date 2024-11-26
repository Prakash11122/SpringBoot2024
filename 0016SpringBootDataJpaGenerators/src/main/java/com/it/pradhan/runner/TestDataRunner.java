package com.it.pradhan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.it.pradhan.entity.Product;
import com.it.pradhan.repo.ProductRepository;


@Component
public class TestDataRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository prepo;

	@Override
	public void run(String... args) throws Exception {
		Product p1 = new Product();
		p1.setProdName("PEN");
		p1.setProdCost(200.0);
		p1 = prepo.save(p1);
		System.out.println(p1.getProdId());
		

	}

}
