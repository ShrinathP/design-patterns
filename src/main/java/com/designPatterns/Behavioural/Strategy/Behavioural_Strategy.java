package com.designPatterns.Behavioural.Strategy;

public class Behavioural_Strategy {
	//JournalDev
	//https://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial
    //Traveller Vehicle Example
    //https://www.sourcecodeexamples.net/2018/06/low-coupling-grasp-pattern.html
		
	//GIST
	//It Enables the client to choose from the family of related but different algorithms
	//simpler way to choose any algorithm at runtime
	
	//Strategy pattern is also known as Policy Pattern. 
	//We define multiple algorithms and let client application pass the algorithm to be used as a parameter.
	
	//OCP based
	//This pattern is based on Open/closed principle. 
	//We don’t need to modify the context [closed for modification], but can choose and add any implementation [open for extension].
	
	//EXAMPLE Collections.sort can take any implementation of Comparator
	
	//USE CASE
	/*
	Lets say you want to call different implementations of a particular task
	and that implementations is based on the client , they can choose
	
	Problem:
	Here we want to implement different payment Strategies for a Shopping cart
	--------------------------------
	Steps to create Strategy Pattern
	--------------------------------
	1. Create an interface with a method that has to be implemented by each PaymentStrategy eg. pay method
	2. Create PaymentStrategies eg. PayPal , CreditCards etc which implement this interface
	
	3. Create Item class (this will be used in Shopping cart / purely optional)
	
	4. Create ShoppingCart Context which has a pay method which takes PaymentStrategies and calls their pay method
	
	//STRATEGY VS STATE
	
	Strategy Pattern is very similar to State Pattern. 
	In State Pattern
	CONTEXT STORES THE STATE
	
	In Strategy Pattern
	CONTEXT DOES NOT HAVE ANY VARIABLE TO STORE STRATEGY
	One of the difference is that 
	Context contains state as instance variable and there can be multiple tasks whose implementation can be dependent on the state 
	whereas in strategy pattern strategy is passed as argument to the method and context object doesn’t have any variable to store it.
	
	*/
	
	
	
	
}
