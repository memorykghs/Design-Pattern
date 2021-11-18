package com.team.composite;

public interface Component {

	public void add (Component c);
	
	public void remove(Component c);
	
	public Component getComponent(int i);
	
	public void doService();
}
