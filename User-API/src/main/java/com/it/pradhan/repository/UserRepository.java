package com.it.pradhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.it.pradhan.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value = "SELECT COUNT(*) > 0 FROM Users WHERE aadhar_ID = :aadharID", nativeQuery = true)
    boolean existsByAadharID(String aadharID);

}
