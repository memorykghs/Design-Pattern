package com.team.strategy;

public class Client {

	public static void main(String[] args) {

		Camera camera = new Camera();
		camera.setMode(new DailyMode());
		camera.photograph();

		System.out.println("==========");

		camera.setMode(new NightMode());
		camera.photograph();

		System.out.println("==========");

		camera.setMode(new DynamicMode());
		camera.photograph();
	}
}
