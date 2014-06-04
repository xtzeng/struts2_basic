import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class SecondInterceptor implements Interceptor{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void intecept(ActionInvocation invocation) {
		// TODO Auto-generated method stub
		logger.info("2");
		invocation.invoke();
		logger.info("-2");
		
	}

}
