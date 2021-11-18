package com.team.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	/** 用來裝子項目的容器 */
	private List<Component> list = new ArrayList<>();

	@Override
	public void add(Component c) {
		list.add(c);
	}

	@Override
	public void remove(Component c) {
		list.remove(c);
	}

	@Override
	public Component getComponent(int i) {
		return list.get(i);
	}

	@Override
	public void doService() {
		// 容器物件請求轉交子項目去做
		// 每個子項目都要跑，用迴圈遍歷
		for (Object obj : list) {
			((Component) obj).doService();
		}

	}
}
