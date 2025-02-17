package com.acc.service;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.constants.BankAccountConstants;
import com.acc.dto.AccountDTO;
import com.acc.dto.BankAccountDTO;
import com.acc.entity.BankAccount;
import com.acc.repo.AccountRepo;

@Service
public class AccountService implements IAccountService {

	@Autowired
	private AccountRepo accountRepo;

	@Override
	public String createBankAccount(AccountDTO accountDTO) {
		String accountNumber = generateBankAccountNumber();

		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountHolderName(accountDTO.getFirstName() + " " + accountDTO.getLastName());
		bankAccount.setAccountNumber(Long.parseLong(accountNumber));
		// bankAccount.setAccountStatus(1);

		bankAccount.setAccountStatus(BankAccountConstants.ACCOUNT_STATUS_A);
	    if (accountDTO.getAccounType()
	        .equals(BankAccountConstants.BANK_TYPE_S)) {
	      bankAccount.setAccountType("SAVINGS");
	    } else if (accountDTO.getAccounType()
	        .equals(BankAccountConstants.BANK_TYPE_C)) {
	      bankAccount.setAccountType("CURRENT");
	    } else {
	      bankAccount.setAccountType("ZERO");
	    }

	    if (accountDTO.getBranchType()
	        .equals(BankAccountConstants.BRANCH_NAME_B)) {
	      bankAccount.setAccountType("BLR");
	    } else if (accountDTO.getBranchType()
	        .equals(BankAccountConstants.BRANCH_NAME_C)) {
	      bankAccount.setAccountType("CHN");
	    } else {
	      bankAccount.setAccountType("HYD");
	    }
	    bankAccount.setIfscCode(BankAccountConstants.IFSC_CODE);
	    bankAccount.setDateOpened(LocalDate.now());
	    // store in DB
	    return null;


	}

	private String generateBankAccountNumber() {

		// Ensure the branch code is not empty or null
		if (BankAccountConstants.BRANCH_CODE == null || BankAccountConstants.BRANCH_CODE.isEmpty()) {
			throw new IllegalArgumentException("Branch code cannot be null or empty");
		}

		// Generate a random 6-digit number
		Random random = new Random();
		int randomNumber = 100000 + random.nextInt(900000); // Random number between 100000 and 999999

		// Combine the branch code and the random number to form the account number
		return BankAccountConstants.BRANCH_CODE + String.format("%06d", randomNumber); // Format the random number to 6
																						// digits

	}

	@Override
	public void getAllBankAcconts() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getBankAccountByAccountNumber(Long accountNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public String deleteBankAccountByAccountNumber(Long accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBankAccountByAccountNumber(Long accountNumber, BankAccountDTO bankAccountDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
