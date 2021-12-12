package com.designPatterns.Creational.Factory;

public class Iphone implements Mobile{
	
	private String PROCESSOR;
	private String GPU;
	private String RAM;
	
	@Override
	public void createMobile() {
		System.out.println("Iphone Mobile Created with " + this.RAM +" and "+ this.PROCESSOR + " and "+ this.GPU);	
	}
	
	
	public Iphone(String GPU, String RAM, String PROCESSOR) {
		this.GPU = GPU;
		this.RAM = RAM;
		this.PROCESSOR = PROCESSOR;
		createMobile();
	}

	
}
