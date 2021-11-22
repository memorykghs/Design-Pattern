package com.team.decorator;

import java.math.BigDecimal;

public abstract class Drink {

	String description = "Unknown drink";

	public String getDescription() {
		return description;
	}
	
	public abstract BigDecimal cost();
}
