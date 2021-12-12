package com.designPatterns.B_Chain_of_Responsibility;

public class Dollar10Dispenser implements DispenseChain{

	private DispenseChain chain;
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
		
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount() >= 10) {
			int notes20 = cur.getAmount()/10;
			int remainder = cur.getAmount()%10;
			System.out.println("Dispensing" + notes20 + " 10$ notes");
			
			
				System.out.println("Cannot dispense pennies "+ remainder);
				
			
		}
		
	}

}
