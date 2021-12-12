package com.designPatterns.B_Chain_of_Responsibility;

public class Dollar20Dispenser implements DispenseChain{

	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
		
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount() > 20) {
			int notes50 = cur.getAmount()/20;
			int remainder = cur.getAmount()%20;
			System.out.println("Dispensing" + notes50 + " 20$ notes");
			if(remainder!=0) {
				//Call the dispense function of next chain
				this.chain.dispense(new Currency(remainder));
			}else {
				//Why this needed??
				this.chain.dispense(cur);
			}
		}
		
	}

}
