package com.i18n.test;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;


public class LocalTest {

	@Test
	public void testGetLocal() {
		
		Locale[] locales = Locale.getAvailableLocales();
		
		for(Locale locale : locales){
			//System.out.println(locale.getDisplayCountry() + " : " + locale.getCountry()+";"+locale.getDisplayLanguage() + " : " + locale.getLanguage());
			
			System.out.println(locale.getDisplayLanguage() + " : " + locale.getLanguage());
		}
	}
	
	
	@Test
	public void testParameter() {
		
		Locale locale = Locale.US;
		
		ResourceBundle bundle = ResourceBundle.getBundle("hellofile",locale);
		
		String value = bundle.getString("hello");
		
		String result = MessageFormat.format(value,new Object[]{"北京"});
		
		
		System.out.println(result);
	}
	
	@Test
	public void testResouceBundle() {
		Locale locale = Locale.getDefault();
		//Locale locale = Locale.US;
		
		ResourceBundle bundle = ResourceBundle.getBundle("hellofile",locale);
		
		String value = bundle.getString("hello");
		
		System.out.println(value);
	}
}
