package com.designPatterns.Behavioural.Chain_of_Responsibility;

public class Behavioural_Chain {

	//
	// GIST
	//IF you are unaware of which request handler will handle the request.
	//Use Chain of Responsibility Pattern
	
	/*
	Chain of Responsibility is behavioral design pattern 
	that allows passing request along the chain of potential handlers
	until one of them handles request.
	*/
	
	//USE CASE
	/*
	Lets say you have an ATM dispensing machine which decides which notes to dispense 
	based of the amount sent
	
	//Steps to create this pattern
	
	1. Handlers Interface , this will provide the common implementation of all the Handlers
	
	2. ConcreteHAndlers Implementation of the above Handler
	
	3. Client Originator of the request, and this will access the handlers to handle it
	
	In this example
	Client is AtmDispenser which will use Dispense50dollar, Dispense20Dollar, Dispense10Dollar
	
	Currency Class is just a normal class which will represent the amount in Currency unit
	*/
	
}
