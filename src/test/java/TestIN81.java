import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;


public class TestIN81 {
	public static void main(String[] args) {
		
	}
	
	@Test
	public void testChinese() {
		ResourceBundle res = ResourceBundle.getBundle("app", Locale.CHINA);
		System.out.println(res.getString("welcome.msg" ));
	}
	
	@Test
	public void testUS() {
		ResourceBundle res = ResourceBundle.getBundle("app", Locale.US);
		System.out.println(res.getString("welcome.msg" ));
	}
}
