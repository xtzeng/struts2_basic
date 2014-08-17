package com.immutable.alias.i18n;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ChangeLanguage extends ActionSupport {
	
	@SuppressWarnings("unchecked")
	public Map<String, Locale> getLocales() {
		Map l = new HashMap();
		l.put(getText("english"), Locale.US);
		l.put(getText("chinese"), Locale.CHINA);
		return l;
	}
}
