import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Action {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void execute() {
		logger.info("execute!");
	}
}
