package com.cg.entity;

public class ContactUsers {
	
	private int userId;
	private String userName;
	public int getUserId() {
		return userId;
	}
	@Override
	public String toString() {
		return "ContactUsers [userId=" + userId + ", userName=" + userName + "]";
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public ContactUsers(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	
	
	}

