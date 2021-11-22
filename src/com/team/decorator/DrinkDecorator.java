package com.team.decorator;

import java.math.BigDecimal;

public abstract class DrinkDecorator extends Drink{
	
	Drink drink;

	public abstract String getDescription();
	
	public abstract BigDecimal cost();
}
