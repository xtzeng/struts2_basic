import org.junit.Test;


public class StringTest {

	@Test
	public void testTrim() {
		
		String s1 = "  cc c ";
		System.out.println(s1.length());//7
		System.out.println(s1.trim().length());//4
		//trim()方法去掉首尾空格
	}
}
