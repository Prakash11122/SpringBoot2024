package com.it.pradhan.repo;

import org.springframework.data.jpa.repository.JpaRepository;import com.it.pradhan.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	

}
