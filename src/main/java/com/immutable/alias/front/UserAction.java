package com.immutable.alias.front;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private int type;
	
	
	
	public int getType() {
		return type;
	}



	public void setType(int type) {
		this.type = type;
	}



	@Override
	public String execute() {
		if (type==1) {
			return "success";
		}else if (type==2) {
			return "error";
		}else return "mainpage";
		
	}
}
