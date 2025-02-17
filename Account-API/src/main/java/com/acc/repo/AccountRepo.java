package com.acc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acc.entity.BankAccount;

@Repository
public interface AccountRepo extends JpaRepository<BankAccount, String>{

}
