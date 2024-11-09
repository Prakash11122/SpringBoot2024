package com.it.pradhan.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.it.pradhan.entity.Product;
import com.it.pradhan.repo.ProductRepo;

@Component
public class TestOperationsRunner implements CommandLineRunner {

	@Autowired
	private ProductRepo repo;

	@Override
	public void run(String... args) throws Exception {

		//System.out.println(repo.getClass().getName());
		
		Product p1 = new Product(10,"P2",300.0);
		Product p2 = new Product(11,"P3",400.0);
		Product p3 = new Product(12,"P4",500.0);
		
		
		/*repo.save(p1);
		repo.save(p2);
		repo.save(p3);*/
		repo.saveAll(Arrays.asList(p1,p2,p3));
		
		Iterable<Product> data = repo.findAll();
		for(Product pob:data) {
			System.out.println(pob);
		}
		
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
		//JDK 1.8 Default method + Lambda Expression
		data.forEach(ob-> System.out.println(ob));
		
		
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
		//JDK 1.8 Default method + Method References
		data.forEach(System.out::println);
		
		System.out.println(repo.existsById(11));//true
		System.out.println(repo.existsById(55));//false
		
		System.out.println(repo.count());//long -- no.of rows
		
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
		
		Optional<Product> byId = repo.findById(11);
		if(byId.isPresent()) {
			Product product = byId.get();
			System.out.println(product);
		}else {
			System.out.println("Data not Found");
		}
		
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
		
		Iterable<Product> allById = repo.findAllById(Arrays.asList(11,12,13,14,15));
		allById.forEach(System.out::println);
		
		
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
		
		repo.deleteById(11);
		repo.deleteAllById(Arrays.asList(10,12,13));
		
		
		

	}

}
