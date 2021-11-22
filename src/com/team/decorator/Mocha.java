package com.team.decorator;

import java.math.BigDecimal;

public class Mocha extends DrinkDecorator{
	
	public Mocha(Drink drink) {
		this.drink = drink;
	}

	@Override
	public String getDescription() {
		return "Mocha " + drink.getDescription();
	}

	@Override
	public BigDecimal cost() {
		return drink.cost().add(new BigDecimal("5"));
	}

}
