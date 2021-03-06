package com.bsejawal.behavioral.state.atm;

public class HasCard implements ATMState{

	//Context
	ATMMachine atmMachine;
	
	public HasCard(ATMMachine newATMMachine){
		atmMachine = newATMMachine;
	}
	@Override
	public void insertCard() {
		System.out.println("You can't enter more than one card");
		
	}

	@Override
	public void ejectCard() {
		System.out.println("Card Ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered) {
		if(pinEntered == 1234){
			System.out.println("Correct PIN");
			atmMachine.correctPinEntered = true;
			atmMachine.setATMState(atmMachine.getHasPinState());
		}else{
			System.out.println("Wrong PIN");
			atmMachine.correctPinEntered = false;
			System.out.println("Card Ejected");
			atmMachine.setATMState(atmMachine.getNoCashState());
		}
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("Enter PIN First");
		
	}
	

}
