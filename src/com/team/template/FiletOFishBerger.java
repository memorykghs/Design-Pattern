package com.team.template;

/**
 * ������
 * 
 * @author memorykghs
 */
public class FiletOFishBerger extends HambergerTemplate {

	String usedMeat = "cod"; // ����

	String usedBun = "bun";

	@Override
	public void roastBun() {
		System.out.println("Roast " + usedBun);
	}

	@Override
	public void addMeat() {
		System.out.println("Added " + usedMeat);
	}

	public void wrapHamberger() {
		System.out.println("FiletOFishBerger wrapped.");
	}
}
