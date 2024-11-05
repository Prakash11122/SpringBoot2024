package com.it.pradhan.repo;

import org.springframework.data.repository.CrudRepository;

import com.it.pradhan.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Integer>{

}
