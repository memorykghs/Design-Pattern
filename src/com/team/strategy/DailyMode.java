package com.team.strategy;

public class DailyMode implements CameraMode{

	@Override
	public void photograph() {
		System.out.println("Daily mode on. Take a photo.");
	}

}
