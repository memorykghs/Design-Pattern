package com.team.observer;

public interface Observable {
	
	public void add(Observer o);
	
	public void remove(Observer o);
	
	public void notifys();
}
