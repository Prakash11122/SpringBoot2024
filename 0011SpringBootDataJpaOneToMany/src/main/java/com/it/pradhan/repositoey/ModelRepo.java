package com.it.pradhan.repositoey;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.pradhan.entity.Model;

public interface ModelRepo extends JpaRepository<Model, Integer> {

}
