package com.designPatterns.Behavioural.Observer;

public class Behavioural_Observer {

	/*
	//GIST
	Defines one to many dependency between object
	IF one object is updated/changed
	all its dependents are notified and updated automatically.
	
	Also called publish-subscribe pattern
	
	there are many observers (subscriber objects) that are observing a particular subject (publisher object). 
	Observers register themselves to a subject to get a notification when there is a change made inside that subject.
	
	Observer can register or unregister a subject at any point to time making objects loosely coupled
	
	
	//REAL WORLD EXAMPLES OF OBSERVER DESIGN PATTERN
	A real world example maybe any social media platform such as Facebook or twitter. 
	When a person updates his status – all his followers gets the notification.
	
	In Java UI Observer Pattern is the basis of message oriented applications like HornetQ, JMS
	*/
	
	
	/*
	Steps to create an observer pattern
	-----------------------------------
	1. Create a Subject interface or abstract class defining operations for attaching and detaching observers
	2. ConcreteSubject(MessagePublisher) which implements this Subject
	
	3_ Observer interface with an unimplemented method
	4_ ConcreteObservers(multiple) which will implement this interface
	5_ State/ Message object this should be immutable message which shouldnt be allowed to change
	*/
	
	
}
