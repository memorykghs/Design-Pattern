package com.team.observer;

import java.util.LinkedList;
import java.util.List;

public class EarthquakeObservable implements Observable {

	private String epicenter;
	
	private static List<Observer> observerList;
	
	public EarthquakeObservable() {
		observerList = new LinkedList<>();
	}

	/**
	 * �b�˸m�W�s�W�a�_�q��
	 */
	@Override
	public void add(Observer o) {
		observerList.add(o);
		System.out.println("�w�s�W�a�_�q��");
	}

	/**
	 * �b�˸m�W�����a�_�q��
	 */
	@Override
	public void remove(Observer o) {
		observerList.remove(o);
		System.out.println("�w�����a�_�q��");
	}

	/**
	 * Observable ���֤߰�!
	 */
	@Override
	public void notifys() {
		observerList.stream().forEach(Observer::update);
	}
	
	/**
	 * �o�ͷs�a�_
	 * @param epicenter
	 */
	public void earthquakeHappen(String epicenter) {
		this.epicenter = epicenter;
		notifys();
	}
	
	/**
	 * ���o�a�_�_��
	 * @return
	 */
	public String getEpicenter() {
		return this.epicenter;
	}
}
