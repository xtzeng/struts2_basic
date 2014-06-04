import java.util.ArrayList;
import java.util.List;


public class ActionInvocation {

	List<Interceptor> interceptors = new ArrayList<Interceptor>();
	Action action = new Action();
	int index = -1;
	
	public ActionInvocation() {
		this.interceptors.add(new FirstInterceptor());
		this.interceptors.add(new SecondInterceptor());
	}
	
	public void invoke() {
		index++;
		if (index>=this.interceptors.size()) {
			action.execute();
		}else {
			this.interceptors.get(index).intecept(this);
		}
	}
}
