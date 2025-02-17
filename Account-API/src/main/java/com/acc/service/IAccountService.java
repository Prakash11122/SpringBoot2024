package com.acc.service;

import com.acc.dto.AccountDTO;
import com.acc.dto.BankAccountDTO;

public interface IAccountService {
	
	String createBankAccount(AccountDTO accountDTO);

	  void getAllBankAcconts();

	  void getBankAccountByAccountNumber(Long accountNumber);

	  String deleteBankAccountByAccountNumber(Long accountNumber);

	  String updateBankAccountByAccountNumber(
	          Long accountNumber, 
	          BankAccountDTO bankAccountDTO);


}
