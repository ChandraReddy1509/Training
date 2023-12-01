package com.cg.Entity;

public class ClientEntity {
	 private int  userId;
	 private String userName;
	public int getUserId() {
		return userId;
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
	public ClientEntity(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "ClientEntity [userId=" + userId + ", userName=" + userName + "]";
	}
}


