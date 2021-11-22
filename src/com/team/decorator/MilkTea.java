package com.team.decorator;

import java.math.BigDecimal;

public class MilkTea extends Drink{
	String description = "Milk tea";

	public String getDescription() {
		return description;
	}

	@Override
	public BigDecimal cost() {
		return new BigDecimal("50");
	}
}
