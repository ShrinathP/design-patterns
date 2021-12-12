package com.designPatterns.Creational.Factory;


public class Creational_Factory {

	//https://howtodoinjava.com/design-patterns/creational/implementing-factory-design-pattern-in-java/
	
	//GIST
	//A Factory pattern is used when we have
	//one super class with multiple subclasses and based on the input we need to return one subclass
	//It takes out the responsibility of instantiation from client program to Factory class
	
	//Super class can be an abstract class or an interface
	//Factory pattern makes our code more robust, less coupled and easy to extend. 
	//For example, we can easily change PC class implementation because client program is unaware of this.
	
	//USE CASE
	/*
	1_ Lets say you want to create different mobiles
	for which you have following classes
	Samsung class, Iphone class, Sony class 
	2_ if you create an instance of these classes using (lets assume) new Sony(param1, param2)
	and in future you have used this constructor at multiple places
	3_ if any change happens to the constructor or more methods/params are added
	you need to change this call everywhere
	
	4_ To address this problem FactoryPattern is used where construction of Objects is maintained by Factory class
	
	//STEPS TO REPRODUCE
	 
	
	*/
	public static void main(String[] args) {
		
	}
}
