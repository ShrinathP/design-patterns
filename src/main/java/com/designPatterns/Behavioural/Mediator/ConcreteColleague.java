package com.designPatterns.B_Mediator;

public class ConcreteColleague extends Colleague{

	public ConcreteColleague(Mediator mediatorImpl) {
		super(mediatorImpl);
	}

	@Override
	public void receive(String message) {
	    System.out.println("ConcreteColleague Received: " + message);
	}

}
