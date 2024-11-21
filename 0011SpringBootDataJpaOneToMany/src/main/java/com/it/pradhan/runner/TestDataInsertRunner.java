package com.it.pradhan.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.it.pradhan.entity.Model;
import com.it.pradhan.entity.Product;
import com.it.pradhan.repositoey.ModelRepo;
import com.it.pradhan.repositoey.ProductRepo;


@Component
public class TestDataInsertRunner implements CommandLineRunner {
	
	
	@Autowired
	private ModelRepo mrepo;
	
	
	@Autowired
	private  ProductRepo prepo;

	@Override
	public void run(String... args) throws Exception {
		
		
		Model m1 = new Model(1012, "XYZ-A", "4GB-128GB-RED");
		Model m2 = new Model(1013, "XYZ-B", "6GB-256GB-GREEN");
		Model m3 = new Model(1014, "MN-C", "12GB-512GB-PINK");
		Model m4 = new Model(1011, "MN-D", "2GB-64GB-BLACK");
		
		
		Product p1 = new Product(10, "ABCD-XYZ", Arrays.asList(m1,m2));
		Product p2 = new Product(11, "ABCD-MN", Arrays.asList(m3,m4));
		
		

		mrepo.save(m1);
		mrepo.save(m2);
		mrepo.save(m3);
		mrepo.save(m4);
		
		prepo.save(p1);
		prepo.save(p2);
		

	}

}
