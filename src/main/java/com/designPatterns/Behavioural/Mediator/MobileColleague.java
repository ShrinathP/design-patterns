package com.designPatterns.B_Mediator;

public class MobileColleague extends Colleague{

	public MobileColleague(Mediator mediator) {
		super(mediator);
	}
	
	@Override
	public void receive(String message) {
	    System.out.println("Mobile Received: " + message);
	}
}
