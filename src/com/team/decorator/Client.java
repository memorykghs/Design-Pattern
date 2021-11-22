package com.team.decorator;

public class Client {
	
	public static void main(String[] args) {
		// �s�@����
		Drink milkTea = new MilkTea();
		System.out.println(milkTea.getDescription());
		System.out.println(milkTea.cost());
		
		// �s�@�ٯ�����
		Drink mochaMilkTea = new MilkTea();
		mochaMilkTea = new Mocha(mochaMilkTea);
		System.out.println(mochaMilkTea.getDescription());
		System.out.println(mochaMilkTea.cost());
		
		// �s�@�ٯ����ꥤ��
		Drink taroMochaMilkTea = new MilkTea();
		taroMochaMilkTea = new Mocha(taroMochaMilkTea);
		taroMochaMilkTea= new Taro(taroMochaMilkTea);
		System.out.println(taroMochaMilkTea.getDescription());
		System.out.println(taroMochaMilkTea.cost());
	}
	
}
