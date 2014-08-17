package com.guice.test;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Module;

public class Bind implements Module {
	
	public void configure(Binder binder) {
		binder.bind(GuiceTest.class).to(GuiceTestImpl.class);
	}

	public static void main(String[] args) {
		Guice.createInjector(new Bind()).getInstance(GuiceTest.class).print();
	}

}