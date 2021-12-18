package com.designPatterns.Behavioural.Strategy;

public class ShoppingCartTest {
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by paypal
		cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
		
		//pay by credit card
		cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
		
		/*
		 * Key Difference between strategy pattern and Template Pattern
		 * In summary:
Template method pattern: compile-time algorithm selection by subclassing
Strategy pattern: run-time algorithm selection by containment
		 * 
		 *  the key difference is that Strategy Pattern is about  
		 *  modifying a behaviour of a context in runtime using strategies, while Template Method Pattern is about 
		 *  following a skeleton 
		 *  implementation of an algorithm and modifying its behaviour by overriding methods of the skeleton class in the subclasses.
		 * */
	}
}
