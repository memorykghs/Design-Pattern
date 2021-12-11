package com.team.iterator;

public interface Iterable {
	
	public Iterator getIterator();
	
	public void addItem(Object item);
	
	public int getLength();
	
	public Object getItemAt(int index);

}
