package com.designPatterns.Behavioural.Strategy;

public class PaypalStrategy implements PaymentStrategy{
	
	private String emailId;
	private String password;
	
	public PaypalStrategy(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}
	
	//Other way instead of an abstract method and implementation is use reflection to 
	//and implement copy method in base class only , but this will create instnace of child class

}
