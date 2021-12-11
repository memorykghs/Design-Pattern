package com.team.iterator;

public class Client {
	
	public static void main(String[] args) {
		
		Iterable iterable = new ConcreteIterable();
		iterable.addItem(new Item("Bird"));
		iterable.addItem(new Item("Monkey"));
		iterable.addItem(new Item("Dimo"));
		iterable.addItem(new Item("Aunt"));
		
		Iterator iterator = new ConcreteIterator(iterable);
		while (iterator.hasNext()) {
			Item item = (Item) iterator.current();
			System.out.println(item.getName());
		}
		
	}
}
