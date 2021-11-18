package com.team.composite;

public class MapleLeaf implements Component {

	@Override
	public void add(Component c) {
		// MapleMapleLeaf 不能 add, pring log
		System.out.println("MapleLeaf 不可再新增子元素");
	}

	@Override
	public void remove(Component c) {
		// MapleLeaf 不能 remove, pring log
		System.out.println("MapleLeaf 無刪除子元素功能");
	}

	@Override
	public Component getComponent(int i) {
		// MapleLeaf 不能 getComponent, pring log
		System.out.println("MapleLeaf 無子元素");
		return null;
	}

	@Override
	public void doService() {
		System.out.println("MapleLeaf：我真的有在做事!!!");
	}
}
