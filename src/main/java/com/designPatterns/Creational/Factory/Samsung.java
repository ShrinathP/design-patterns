package com.designPatterns.Creational.Factory;

public class Samsung implements Mobile{

	private String RAM;
	private String PROCESSOR;
	
	public Samsung(String RAM, String PROCESSOR) {
		this.RAM = RAM;
		this.PROCESSOR = PROCESSOR;
		createMobile();
	}

	@Override
	public void createMobile() {
		System.out.println("Samsung Mobile Created with " + this.RAM +" and "+ this.PROCESSOR);
		
	}
}
