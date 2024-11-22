package com.it.pradhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.pradhan.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
