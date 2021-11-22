package com.team.decorator;

import java.math.BigDecimal;

public class Taro extends DrinkDecorator{
	
	public Taro(Drink drink) {
		this.drink = drink;
	}

	@Override
	public String getDescription() {
		return "Taro " + drink.getDescription();
	}

	@Override
	public BigDecimal cost() {
		return drink.cost().add(BigDecimal.TEN);
	}

}
