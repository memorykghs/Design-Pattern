package com.team.observer;

public class Client {

	public static void main(String[] args) {

		EarthquakeObservable earthquakeObservable = new EarthquakeObservable();

		Phone phone = new Phone(earthquakeObservable);
		NoteBook notebook = new NoteBook(earthquakeObservable);

		earthquakeObservable.add(phone);
		earthquakeObservable.add(notebook);
		
		earthquakeObservable.earthquakeHappen("�y���~��");
		earthquakeObservable.earthquakeHappen("�x�F");
		
		earthquakeObservable.remove(phone);
	}
}
