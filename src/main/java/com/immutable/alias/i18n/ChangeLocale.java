package com.immutable.alias.i18n;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ChangeLocale extends ActionSupport {
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		Locale l;
		// key=1,chinese
		if (key.equals("1")) {
			l = Locale.CHINA;
		} else {
			l = Locale.US;
		}
		ActionContext.getContext().setLocale(l);
		session.setAttribute("WW_TRANS_I18N_LOCALE", l);
		return SUCCESS;
	}
}
