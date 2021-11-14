package com.team.adapter;

public class GrayWolfTransfer implements AnimalTransfer{

	@Override
	public String transferToSheep() {
		return "Eat grass";
	}

	@Override
	public void origin() {
		System.out.println("­ì¥»¬O¦Ç¯T");
	}

}
