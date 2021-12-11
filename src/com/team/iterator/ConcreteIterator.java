package com.team.iterator;

public class ConcreteIterator implements Iterator {

	int index = 0; // pointer

	private Iterable iterable; // 明確指定此 Iterator 的化也可以將型別定為 ConcreteIterable

	public ConcreteIterator(Iterable items) {
		this.iterable = items;
	}

	@Override
	public boolean hasNext() {

		if (index < iterable.getLength()) {
			return true;
		}
		return false;
	}

	@Override
	public void next() {
		this.index += 1;
	}

	@Override
	public Object current() {
		return iterable.getItemAt(index++); 
	}

}
