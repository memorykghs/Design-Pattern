package com.team.composite;

public class Leaf implements Component {

	@Override
	public void add(Component c) {
		// Leaf ���� add, pring log
		System.out.println("Leaf ���i�A�s�W�l����");
	}

	@Override
	public void remove(Component c) {
		// Leaf ���� remove, pring log
		System.out.println("Leaf �L�R���l�����\��");
	}

	@Override
	public Component getComponent(int i) {
		// Leaf ���� getComponent, pring log
		System.out.println("Leaf �L�l����");
		return null;
	}

	@Override
	public void doService() {
		System.out.println("Leaf�G�گu�����b����!");
	}
}
