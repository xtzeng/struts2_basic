package com.xiaoti.front;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




import sun.tools.tree.ThisExpression;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private final static Logger logger = LoggerFactory.getLogger(UserAction.class);
	private String name;
	private int age;
	
	public String add() {
		logger.info("name=========" +name);
		logger.info("age=========="+age);
		return SUCCESS;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
