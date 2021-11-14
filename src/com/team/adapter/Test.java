package com.team.adapter;

public class Test {

	public static void main(String[] args) {
		BeSheep sheep1 = new SheepAdapter(new WhiteWolfTransfer());
		sheep1.eatGrass();
		
		BeSheep sheep2 = new SheepAdapter(new GrayWolfTransfer());
		sheep2.eatGrass();
	}

}
