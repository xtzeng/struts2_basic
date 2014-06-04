

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class FirstInterceptor implements Interceptor{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void intecept(ActionInvocation invocation) {
		
		logger.info("1");
		invocation.invoke();
		logger.info("-1");
	}

}
