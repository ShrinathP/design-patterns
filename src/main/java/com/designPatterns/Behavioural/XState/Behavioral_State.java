package com.designPatterns.Behavioural.XState;

public class Behavioral_State {

	//Game State Example
	//Nice example
	//https://homeweb.csulb.edu/~pnguyen/cecs277/lecnotes/State%20Design%20Pattern%20in%20Java.pdf
	//Another Example
	//https://java-design-patterns.com/patterns/state/
	
	//Javascript design patterns 
	//https://betterprogramming.pub/javascript-design-patterns-25f0faaaa15
	
	
	//State pattern is used when you want an object to remember its state
	//and change its state depending on prevoius state
	
	//USE CASE
	//In any application, when we are dealing with an object which can be in different states during it’s life-cycle and 
	//how it processes incoming requests (or make state transitions) based on it’s present state – we can use the state pattern.
	
	/*
	If we do not use the state pattern in such case, we will end up having lots of if-else statements 
	
	The state pattern solves problems where an object should change its behavior when its internal state changes.
	Also, adding new states should not affect the behavior of existing states.
	*/
	
	//STEPS to do
	/*
	1_ Define State interface with method that each state class has to implement
	(this method has to take deliveryContext instance)
	2_ Define concreate State classes which implement the above interface
	These classes should be singletons
	and implement the unimplemented method
	3_Context DeliveryCOntext- This will be the interface that client will use to update interface
	
	4- EXAMPLE IS JAVA THREAD STATES
	
	
	Here we will be updating the state of package in this order
	Acknowledged> Shipped > Intransition > OutFordelivery > Delivered
	
	*/
}
