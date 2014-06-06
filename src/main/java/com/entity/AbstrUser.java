package com.entity;

public abstract class AbstrUser {

	public AbstrUser() {

	}

	private int userId;

	private String username;

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public AbstrUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

}
