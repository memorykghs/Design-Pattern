package com.team.strategy;

public class NightMode implements CameraMode{

	@Override
	public void photograph() {
		System.out.println("Night mode on. Take city night scene.");
	}
}
