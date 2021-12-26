package com.team.strategy;

public class Camera {

	private CameraMode cameraMode;
	
	public void photograph() {
		cameraMode.photograph();
	}
	
	public void setMode(CameraMode cameraMode) {
		this.cameraMode = cameraMode;
	}
}
