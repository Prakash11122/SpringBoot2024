package com.acc.dto;

import java.time.LocalDate;

import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class BankAccountDTO {
	
	
	@Id
	  
	  private String accountID;
	
	  private Long accountNumber;

	  private String accountHolderName;
	  
	  private String accountType;
 
	  private String ifscCode;

	  private String branchName;
	 
	  private Integer accountStatus;

	  private LocalDate dateOpened;

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Integer getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(Integer accountStatus) {
		this.accountStatus = accountStatus;
	}

	public LocalDate getDateOpened() {
		return dateOpened;
	}

	public void setDateOpened(LocalDate dateOpened) {
		this.dateOpened = dateOpened;
	}

	@Override
	public String toString() {
		return "AccountDTO [accountID=" + accountID + ", accountNumber=" + accountNumber + ", accountHolderName="
				+ accountHolderName + ", accountType=" + accountType + ", ifscCode=" + ifscCode + ", branchName="
				+ branchName + ", accountStatus=" + accountStatus + ", dateOpened=" + dateOpened + "]";
	}

	public BankAccountDTO(String accountID, Long accountNumber, String accountHolderName, String accountType,
			String ifscCode, String branchName, Integer accountStatus, LocalDate dateOpened) {
		super();
		this.accountID = accountID;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.ifscCode = ifscCode;
		this.branchName = branchName;
		this.accountStatus = accountStatus;
		this.dateOpened = dateOpened;
	}

	public BankAccountDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	  
	  
	  


}
