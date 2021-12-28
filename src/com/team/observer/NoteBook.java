package com.team.observer;

public class NoteBook implements Observer{

private EarthquakeObservable earthquakeObservable;
	
	public NoteBook(EarthquakeObservable earthquakeObservable) {
		this.earthquakeObservable = earthquakeObservable;
	}

	@Override
	public void update() {
		System.out.println("NoteBook: ¾_¥¡¦ì©ó" + this.earthquakeObservable.getEpicenter());
	}
}
