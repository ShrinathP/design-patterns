package com.designPatterns.B_Observer;

public class MessageSubscriberTwo implements Observer{

	@Override
	public void update(Message m) {
        System.out.println("MessageSubscriberThree :: " + m.getMessageContent());		
	}

}
