package com.immutable.alias.action;


import com.immutable.alias.bind.Injectors;
import com.immutable.alias.persist.UserInfo;
import com.immutable.alias.service.ILogin;
import com.opensymphony.xwork2.Action;

public class UserAction {

	UserInfo userInfo;

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public String execute() {
		Injectors in = new Injectors();
		if (in.inject().getInstance(ILogin.class).login(userInfo)) {
			return Action.SUCCESS;
		} else
			return Action.INPUT;
	}
}
