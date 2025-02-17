package com.it.pradhan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usr_tbl")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_ID")
	private Integer userId;
	 @Column(name = "user_Name")
	private String userName;
	@Column(name = "aadhar_ID")
	private String aadharID;
	 @Column(name = "pan_ID")
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
		return "User [userId=" + userId + ", userName=" + userName + ", aadharID=" + aadharID + ", panID=" + panID
				+ "]";
	}
	public User(Integer userId, String userName, String aadharID, String panID) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.aadharID = aadharID;
		this.panID = panID;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
