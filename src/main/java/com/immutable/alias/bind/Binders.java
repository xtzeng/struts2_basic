package com.immutable.alias.bind;



import com.google.inject.AbstractModule;
import com.immutable.alias.service.ILogin;
import com.immutable.alias.service.impl.Login;

public class Binders extends AbstractModule {

	protected void configure() {
		bind(ILogin.class).to(Login.class);
	}
}
