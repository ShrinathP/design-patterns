package com.designPatterns.Behavioural.Chain_of_Responsibility;

//BASE INTERFACE FOR ALL THE HANDLERS
public interface DispenseChain {

	//Method to set next Chain
	void setNextChain(DispenseChain nextChain);
	
	//Method to dispense
	void dispense(Currency cur);
}
