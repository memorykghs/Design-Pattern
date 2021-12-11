package com.team.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterable implements Iterable {

	private List<Object> items = new ArrayList<>();

	@Override
	public Iterator getIterator() {
		return new ConcreteIterator(this); // 將自己傳入迭代器
	}

	@Override
	public void addItem(Object item) {
		items.add(item);
		
	}
	
	@Override
	public int getLength() {
		return items.size();
	}

	@Override
	public Object getItemAt(int index) {
		return items.get(index);
	}
}
