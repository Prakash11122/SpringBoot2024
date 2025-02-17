package com.acc.dto;

public class AccountDTO {
	
	private String firstName;
	private String lastName;

	private String aadharID;
	private String panID;
	private Long contactNumber;
	private String emial;
	private String accounType;
	private String branchType;
	
	
	
	public String getAccounType() {
		return accounType;
	}
	public void setAccounType(String accounType) {
		this.accounType = accounType;
	}
	public String getBranchType() {
		return branchType;
	}
	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}
	public String getAadharID() {
		return aadharID;
	}
	public void setAadharID(String aadharID) {
		this.aadharID = aadharID;
	}
	public String getPanID() {
		return panID;
	}
	public void setPanID(String panID) {
		this.panID = panID;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "AccountDTO [firstName=" + firstName + ", lastName=" + lastName + ", aadharID=" + aadharID + ", panID="
				+ panID + ", contactNumber=" + contactNumber + ", emial=" + emial + ", accounType=" + accounType
				+ ", branchType=" + branchType + "]";
	}
	public AccountDTO(String firstName, String lastName, String aadharID, String panID, Long contactNumber,
			String emial, String accounType, String branchType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.aadharID = aadharID;
		this.panID = panID;
		this.contactNumber = contactNumber;
		this.emial = emial;
		this.accounType = accounType;
		this.branchType = branchType;
	}
	public AccountDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
