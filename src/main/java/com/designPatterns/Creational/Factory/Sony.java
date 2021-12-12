package com.designPatterns.Creational.Factory;

public class Sony implements Mobile{

	private String PROCESSOR;
	private String RAM;
	private String SCREENTYPE;

	public Sony(String RAM, String PROCESSOR, String SCREENTYPE) {
		this.RAM = RAM;
		this.PROCESSOR = PROCESSOR;
		createMobile();
	}
	
	@Override
	public void createMobile() {
		System.out.println("Sony Mobile Created with " + this.RAM +" and "+ this.PROCESSOR +" and "+ this.SCREENTYPE);
		
	}

	
}
