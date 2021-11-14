package com.team.adapter;

public class SheepAdapter implements BeSheep{
	
	private AnimalTransfer animalTransfer;
	
	public SheepAdapter(AnimalTransfer animalTransfer) {
		this.animalTransfer = animalTransfer;
	}

	@Override
	public void eatGrass() {
		animalTransfer.origin();
		System.out.println(animalTransfer.transferToSheep());
	}

}
