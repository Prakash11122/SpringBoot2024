package com.acc.Utils;

import com.acc.dto.AccountDTO;
import com.acc.dto.BankAccountDTO;
import com.acc.entity.BankAccount;

public class AccountUtils {
	
//	public static BankAccount convertBankAccountDTOToBankAccount(BankAccountDTO bankAccountDTO) {
//	    BankAccount bankAccount = new BankAccount();
//	    bankAccount.setAccountHolderName(bankAccountDTO.getAccountHolderName());
//	    bankAccount.setAccountNumber(bankAccountDTO.getAccountNumber());
//	    bankAccount.setAccountStatus(bankAccountDTO.getAccountStatus());
//	    bankAccount.setAccountType(bankAccountDTO.getAccountType());
//	    bankAccount.setBranchName(bankAccountDTO.getBranchName());
//	    bankAccount.setDateOpened(bankAccountDTO.getDateOpened());
//	    bankAccount.setIfscCode(bankAccountDTO.getIfscCode());
//	    
//	    return bankAccount;
//	  }
	
	public static BankAccount convertAccountDTOToBankAccount(
		      AccountDTO accountDTO) {
		    BankAccount bankAccount = new BankAccount();

		    return bankAccount;
		  }

	  public static BankAccountDTO convertBankAccountToBankAccountDTO(BankAccount bankAccount) {
	    BankAccountDTO bankAccountDTO = new BankAccountDTO();
	    
	    bankAccountDTO.setAccountHolderName(bankAccount.getAccountHolderName());
	    bankAccountDTO.setAccountNumber(bankAccount.getAccountNumber());
	    bankAccountDTO.setAccountStatus(bankAccount.getAccountStatus());
	    bankAccountDTO.setAccountType(bankAccount.getAccountType());
	    bankAccountDTO.setBranchName(bankAccount.getBranchName());
	    bankAccountDTO.setDateOpened(bankAccount.getDateOpened());
	    bankAccountDTO.setIfscCode(bankAccount.getIfscCode());

	    return bankAccountDTO;


	  }
}
