package com.pattern.factory_method;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Logistics {

	public BigDecimal calculateCost(BigDecimal kilometers, BigDecimal oneKilometerCost) {
		return kilometers.multiply(oneKilometerCost).setScale(2, RoundingMode.HALF_UP);
	}

	public abstract Transport createTransport();
}
