package com.pattern.factory_method;

import java.math.BigDecimal;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LogisticsTest {

	@Test
	public void calculateCostWithProperScale() {
		// given
		BigDecimal kilometers = new BigDecimal("250.4");
		BigDecimal oneKilometerCost = new BigDecimal("5.29");
		Logistics logistics = new LogisticsMock();

		// when
		BigDecimal calculatedCost = logistics.calculateCost(kilometers, oneKilometerCost);

		// then
		assertThat(calculatedCost).isEqualTo("1324.62");
	}

	private class LogisticsMock extends Logistics {
		public Transport createTransport() {
			return null;
		}
	}
}