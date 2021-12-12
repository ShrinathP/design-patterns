package com.designPatterns.Creational.Factory;

public class MobileFactoryExecution {

	public static void main(String[] args) {
		//MobileFactory fac = new MobileFactory();
		//you can call mobile factory as static method
		MobileFactory.produceMobile(Mobile.IPHONE);
	}
}
