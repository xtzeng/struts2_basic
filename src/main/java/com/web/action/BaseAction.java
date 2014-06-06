package com.web.action;



import java.util.Map;



import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements SessionAware,
		ServletRequestAware {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Map<String, Object> session;

	protected HttpServletRequest request;
	
	public void setSession(Map<String, Object> sessions) {
		this.session =(Map<String, Object>) sessions;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}
