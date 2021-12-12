package com.designPatterns.Creational.Builder;

//Creating Complex objects without loosing immutability
public class Creational_Builder {

	//https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
		
	//GIST
	//Alternate way to create complex object
	//This should be used only when you want to build different immutable objects using same object building process.
	
	
	//USE CASE
	/*
	1_ Lets say you want to create an object with multiple parameters
	2 parameters are required, mandatory
	the rest 3-4 parameters are optional
	for doing this we have to create multiple constructors with multiple combinations
	to avoid this we need to use Builder Pattern
	
	2_ If you do not want to loose immutability with putting external Setter methods
	
	3_ Steps to create Builder pattern
	----------------------------------
	3.1 User is the object we need to create (should have flexibility of arguments and immutability)
	
	STEP 1 User class
	* User class should have a private constructor which takes UserBuilder as arguments
	* should have only getter methods 
	* no setter methods to give immutability
	
	STEP 2 User builder class
	UserBuilder static class which assists in constructing User
	* UserBuilder constructor is accessible to User class
	* This has methods which set values and returns the same  object instance
	* Finally build method uses "this" object and  
	* private User constructor to return the constructed object
	
	
	*/
	
	
	public static void main(String[] args) {
		User user1 = new User.UserBuilder("Lokesh", "Gupta")
			    .age(30)
			    .phone("1234567")
			    .address("Fake address 1234")
			    .build();
			 
			    System.out.println(user1);
			 
			    User user2 = new User.UserBuilder("Jack", "Reacher")
			    .age(40)
			    .phone("5655")
			    //no address
			    .build();
			 
			    System.out.println(user2);
			 
			    User user3 = new User.UserBuilder("Super", "Man")
			    //No age
			    //No phone
			    //no address
			    .build();
			 
			    System.out.println(user3);
	}
	
}
