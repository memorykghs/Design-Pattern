package com.team.observer;

public class Phone implements Observer {
	
	private EarthquakeObservable earthquakeObservable;
	
	public Phone(EarthquakeObservable earthquakeObservable) {
		this.earthquakeObservable = earthquakeObservable;
	}

	@Override
	public void update() {
		System.out.println("Phone: ¾_¥¡¦ì©ó" + this.earthquakeObservable.getEpicenter());
	}

}
