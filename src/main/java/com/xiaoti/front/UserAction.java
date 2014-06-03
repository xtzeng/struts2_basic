package com.xiaoti.front;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;






import sun.tools.tree.ThisExpression;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xiaoti.model.User;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final static Logger logger = LoggerFactory.getLogger(UserAction.class);
	
	private User user = new User();
	
	public String add() {
		logger.info("name===="+user.getName());
		logger.info("age====="+user.getAge());
		return SUCCESS;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	
	
	
	
}
