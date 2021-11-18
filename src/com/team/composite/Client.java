package com.team.composite;

public class Client {
	
	public static void main(String[] args) {
		Composite comosite = new Composite();
		comosite.add(new Leaf());
		comosite.add(new MapleLeaf());
		
		comosite.doService();
	}
}
