package com.team.template;

/**
 * ���h���צN�h��
 * @author memorykghs
 */
public class DoubleCheeseBerger extends HambergerTemplate {

	String usedMeat = "beef";

	String usedBun = "rice";

	@Override
	public void roastBun() {
		System.out.println("Roast " + usedBun);
	}

	@Override
	public void addMeat() {
		System.out.println("Added " + usedMeat);
	}
	
	public void wrapHamberger() {
		System.out.println("DoubleCheeseBerger wrapped.");
	}

	public boolean doubleCheeseBerger() {
		return true;
	}
}
