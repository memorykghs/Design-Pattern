package com.team.composite;

public class Leaf implements Component {

	@Override
	public void add(Component c) {
		// Leaf 不能 add, pring log
		System.out.println("Leaf 不可再新增子元素");
	}

	@Override
	public void remove(Component c) {
		// Leaf 不能 remove, pring log
		System.out.println("Leaf 無刪除子元素功能");
	}

	@Override
	public Component getComponent(int i) {
		// Leaf 不能 getComponent, pring log
		System.out.println("Leaf 無子元素");
		return null;
	}

	@Override
	public void doService() {
		System.out.println("Leaf：我真的有在做事!");
	}
}
