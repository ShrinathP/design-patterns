package com.designPatterns.B_Observer;

//Immutable message class
public class Message {
	final String messageContent;
    
    public Message (String m) {
        this.messageContent = m;
    }
 
    public String getMessageContent() {
        return messageContent;
    }
}
