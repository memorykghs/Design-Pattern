package com.team.adapter;

public class WhiteWolfTransfer implements AnimalTransfer{

	@Override
	public String transferToSheep() {
		return "Eat grass";
	}

	@Override
	public void origin() {
		System.out.println("原本是白狼");
	}

}
