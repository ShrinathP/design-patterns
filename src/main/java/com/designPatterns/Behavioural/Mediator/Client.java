package com.designPatterns.Behavioural.Mediator;

public class Client {

	public static void main(String[] args){
	
		ApplicationMediator mediator = new ApplicationMediator();
	    ConcreteColleague desktop = new ConcreteColleague(mediator);
	    MobileColleague mobile = new MobileColleague(mediator);

	    //mediator.send("Hii",desktop);

	    mediator.addColleague(desktop);
	    mediator.addColleague(mobile);
	    desktop.send("Hello World");
	    mobile.send("Hello");
	}
	
}
