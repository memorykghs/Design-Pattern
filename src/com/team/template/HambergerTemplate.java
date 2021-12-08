package com.team.template;

public abstract class HambergerTemplate {
	
	final void makeHamberger() {
		
		roastBun();
		addMeat();
		
		if(doubleCheeseBerger()) {
			addCheese();
			addMeat();
		}
		addCheese();
		addVegetables();
		wrapHamberger();
	}
	
	public abstract void roastBun();
	
	public abstract void addMeat();
	
	public void addCheese() {
		System.out.println("Added cheese.");
	}
	
	public void addVegetables() {
		System.out.println("Added vegetables");
	}
	
	public void wrapHamberger() {
		System.out.println("Hamberger wrapped.");
	}
	
	public boolean doubleCheeseBerger() {
		return false;
	}
}
