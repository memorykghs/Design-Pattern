package com.team.strategy;

public class DynamicMode implements CameraMode{

	@Override
	public void photograph() {
		System.out.println("Dynamic mode on. Take exercising photo.");		
	}
}
