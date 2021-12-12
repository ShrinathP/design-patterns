package com.designPatterns.Creational.Prototype;

public class Creational_Prototype {

	//https://www.journaldev.com/1440/prototype-design-pattern-in-java
		//https://howtodoinjava.com/design-patterns/creational/prototype-design-pattern-in-java/
		
	//Prototype is a template of any object before the actual object is constructed
	//Main advantage of this pattern is 
	//to have minimal instance creation process which is much costly than cloning process.
	
	//USE CASE
	/*
	1_
	Used when a number of instances of a class needed to be created 
	and all the instances are of same state or differ not by much
	
	
	In this design pattern an instance of the actual object is created at the start
	and whenever we required a new instance the previous created instance is cloned
	
	3_Problem statement
	Problem Statement 
	I am creating an entertainment application that will require instances of Movie, Album and Show classes very frequently. 
	I do not want to create their instances everytime as it is costly. 
	So, I will create their prototype instances, and everytime when i will need a new instance, I will just clone the prototype.
	
	2_ Steps to create a prototype pattern
	1. create an interface that has unimplemented clonemethod declaration
	2. All the classes implementing the interface should write method for it
	
	PrototypeFactory
	3. Create a private Map in static block (Key=instanceName Value=instance)
	* put all the created instances in that map 
	4. create a static class(enum type), that has static final variable names representing these classes in step 2//same as enum//
	5. create a static method getInstance which get the value from the filled map and call clone method on the instance
	
	
	*/
	
	
	
}
