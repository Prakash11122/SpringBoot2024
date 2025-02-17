package com.it.pradhan.dto;

public class UserDTO {
	
	private Integer userId;
	 
	private String userName;
	
	private String aadharID;
	 
	private String panID;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + ", aadharID=" + aadharID + ", panID=" + panID
				+ "]";
	}

	public UserDTO(Integer userId, String userName, String aadharID, String panID) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.aadharID = aadharID;
		this.panID = panID;
	}

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
