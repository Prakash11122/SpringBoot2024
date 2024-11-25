package com.it.pradhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.it.pradhan.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	@Transactional
	@Modifying
	@Query("UPDATE Product SET prodName=:pn WHERE prodId=:pid")
	int updateNameById(String pn, Integer pid);
	
	
	
	@Transactional
	@Modifying
	@Query("DELETE Product WHERE prodId=:pid")
	int removeById(Integer pid);

}
