package com.web.action;

import com.entity.ext.User;

public class UserAction extends BaseAction {

	private User user;
	
	public String main() throws Exception {
		user.setUsername("wm5920");
		user.setPassword("123");
		user.setUserId(1);
		return "index";
	}

	
	public String save() {
		
		return "index";
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
