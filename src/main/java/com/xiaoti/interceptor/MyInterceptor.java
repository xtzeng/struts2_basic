package com.xiaoti.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		long start = System.currentTimeMillis();
		String r = invocation.invoke();
		long end = System.currentTimeMillis();
		logger.info("action time = " + (end -start));
		return r;
	}

}
