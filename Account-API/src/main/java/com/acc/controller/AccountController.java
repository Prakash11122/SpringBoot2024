package com.acc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acc.dto.AccountDTO;
import com.acc.dto.BankAccountDTO;
import com.acc.service.IAccountService;

@RestController
@RequestMapping("/account/api")
public class AccountController {
	
	@Autowired
	private IAccountService iAccountService;
	
	
	@PostMapping("/account")
	  public String createBankAccount(
	        @RequestBody AccountDTO accountDTO) {
		iAccountService.createBankAccount(accountDTO);
	    return null;
	  }

	  @GetMapping("/accounts")
	  public List<BankAccountDTO> getAllBankAcconts() {
	    // TODO Auto-generated method stub
	    return null;
	  }

	  @GetMapping("account/{accountNumber}")
	  public BankAccountDTO getBankAccountByAccountNumber(
	        @PathVariable Long accountNumber) {
	    // TODO Auto-generated method stub
	    return null;
	  }

	  @DeleteMapping("delete/{accountNumber}")
	  public String deleteBankAccountByAccountNumber(
	        @PathVariable Long accountNumber) {
	    // TODO Auto-generated method stub
	    return null;
	  }

	  @PutMapping("update/{accountNumber}")
	  public String updateBankAccountByAccountNumber(
	      @PathVariable Long accountNumber,
	      @RequestBody BankAccountDTO bankAccountDTO) {
	    // TODO Auto-generated method stub
	    return null;
	  }

}
