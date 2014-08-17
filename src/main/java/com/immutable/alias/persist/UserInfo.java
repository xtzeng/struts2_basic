package com.immutable.alias.persist;

public class UserInfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String psw;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPsw() {
		return this.psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

}