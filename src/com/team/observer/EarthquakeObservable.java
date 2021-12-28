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
	 * 在裝置上新增地震通知
	 */
	@Override
	public void add(Observer o) {
		observerList.add(o);
		System.out.println("已新增地震通知");
	}

	/**
	 * 在裝置上移除地震通知
	 */
	@Override
	public void remove(Observer o) {
		observerList.remove(o);
		System.out.println("已移除地震通知");
	}

	/**
	 * Observable 的核心啊!
	 */
	@Override
	public void notifys() {
		observerList.stream().forEach(Observer::update);
	}
	
	/**
	 * 發生新地震
	 * @param epicenter
	 */
	public void earthquakeHappen(String epicenter) {
		this.epicenter = epicenter;
		notifys();
	}
	
	/**
	 * 取得地震震央
	 * @return
	 */
	public String getEpicenter() {
		return this.epicenter;
	}
}
