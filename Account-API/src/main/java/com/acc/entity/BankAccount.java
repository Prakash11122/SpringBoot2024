package com.acc.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="BankAccount")
public class BankAccount {
	
	@Id
	  @Column(name = "account_ID")
	  private String accountID;

	  @Column(name = "account_Number")
	  private Long accountNumber;

	  @Column(name = "account_Holder_Name")
	  private String accountHolderName;

	  @Column(name = "account_Type")
	  private String accountType;

	  @Column(name = "ifsc_Code")
	  private String ifscCode;

	  @Column(name = "branch_Name")
	  private String branchName;

	  @Column(name = "account_Status")
	  private Integer accountStatus;

	  @Column(name = "date_Opened")
	  @Temporal(TemporalType.TIMESTAMP)
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
		return "BankAccount [accountID=" + accountID + ", accountNumber=" + accountNumber + ", accountHolderName="
				+ accountHolderName + ", accountType=" + accountType + ", ifscCode=" + ifscCode + ", branchName="
				+ branchName + ", accountStatus=" + accountStatus + ", dateOpened=" + dateOpened + "]";
	}

	public BankAccount(String accountID, Long accountNumber, String accountHolderName, String accountType,
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

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	  


}
