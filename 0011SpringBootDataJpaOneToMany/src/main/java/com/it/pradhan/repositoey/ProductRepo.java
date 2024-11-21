package com.it.pradhan.repositoey;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.pradhan.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
