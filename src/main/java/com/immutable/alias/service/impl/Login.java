package com.immutable.alias.service.impl;

import com.immutable.alias.persist.UserInfo;
import com.immutable.alias.service.ILogin;


public class Login implements ILogin {

	public boolean login(UserInfo u) {
		if (u.getName().equals("cjgong") && u.getPsw().equals("123456")) {
			return true;
		} else
			return false;
	}
}
