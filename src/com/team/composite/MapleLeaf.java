package com.team.composite;

public class MapleLeaf implements Component {

	@Override
	public void add(Component c) {
		// MapleMapleLeaf ���� add, pring log
		System.out.println("MapleLeaf ���i�A�s�W�l����");
	}

	@Override
	public void remove(Component c) {
		// MapleLeaf ���� remove, pring log
		System.out.println("MapleLeaf �L�R���l�����\��");
	}

	@Override
	public Component getComponent(int i) {
		// MapleLeaf ���� getComponent, pring log
		System.out.println("MapleLeaf �L�l����");
		return null;
	}

	@Override
	public void doService() {
		System.out.println("MapleLeaf�G�گu�����b����!!!");
	}
}
