package com.immutable.alias.bind;


import com.google.inject.Guice;
import com.google.inject.Injector;

public class Injectors {
	public Injector inject() {
		return Guice.createInjector(new Binders());
	}
}
