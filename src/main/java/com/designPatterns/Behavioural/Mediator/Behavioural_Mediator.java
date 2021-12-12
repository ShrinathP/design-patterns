package com.designPatterns.B_Mediator;

public class Behavioural_Mediator {

	/* https://www.journaldev.com/1730/mediator-design-pattern-java
	 * https://dzone.com/articles/design-patterns-mediator
	
	//GIST
	 According to Gang of Founr
	 Mediator pattern is used to 
	 
	 Allows loose coupling by encapsulating the way disparate sets of objects interact and communicate with each other. 
	 Allows for the actions of each object set to vary independently of one another.
	
	//USE CASE
	Very helpful in Enterprise Based applications where multiple objects are interacting with each other
	If the objects interact with each other directly they are tightly coupled and makes higher maintainability
	
	//REAL LIFE EXAMPLES
	1. Air traffic controller is a great example of mediator pattern
	
	Another good example of mediator pattern is a chat application. In a chat application we can have several participants. 
	It’s not a good idea to connect each participant to all the others because the number of connections would be really high. 
	The best solution is to have a hub where all participants will connect; this hub is just the mediator class.
	
    In Java programming, the execute() method inside the java.util.concurrent.
    Executor interface follows this pattern. The different overloaded versions of various schedule() 
    methods of the java.util.Timer class also can be considered to follow this pattern.
     
	//Examples in JDK
	java.util.Timer class scheduleXXX() methods
Java Concurrency Executor execute() method.
java.lang.reflect.Method invoke() method.


	IMP
	Mediator works as a router between objects.
	
	//Steps to create a mediator pattern
	
	//NOTE
	This pattern defines a separate mediator object that encapsulates the interaction between a set of objects
	and objects delegate their interaction to a mediator object instead of interacting with each other directly
	
	Components:-
	1. Mediator -defines the interface for communication between colleague objects
	2. ConcreteMediator - impl of Mediator and co-ordinates communication of colleague objects
	"IT IS AWARE OF ALL THE COLLEAGUES AND THEIR PURPOSES WITH REGARDS TO INTERCOMMUNICATION"
	3. Colleague - defines the interface for communication with other colleagues through its mediator
	
	4. ConcreteColleague - implements the Colleague interface and communicates with other colleagues through its mediator
	
	
	 */
}
