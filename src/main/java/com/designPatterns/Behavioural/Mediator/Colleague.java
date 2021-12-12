package com.designPatterns.B_Mediator;

public abstract class Colleague {

	//Colleague should know the mediator Impl
	private Mediator mediator;
	
	public Colleague(Mediator mediatorImpl) {
		this.mediator = mediatorImpl;
	}
	
	//send a message via the mediator
	public void send(String message) {
	   mediator.send(message, this);
	}
	  
	public Mediator getMediator() {
		return this.mediator;
	}
	
	//a custom receive method implemented by implementations of Colleagues
	  public abstract void receive(String message);
}
