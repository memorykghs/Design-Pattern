package com.team.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	/** �ΨӸˤl���ت��e�� */
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
		// �e������ШD���l���إh��
		// �C�Ӥl���س��n�]�A�ΰj��M��
		for (Object obj : list) {
			((Component) obj).doService();
		}

	}
}
