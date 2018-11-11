package com.creational.factory_method;

import java.util.List;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryMethodTest {

	@Test
	public void usingFactoryMethodPattern() {
		// given|when
		Transport transport1 = LogisticsFactory.choseLogistics(LogisticsType.ROAD).createTransport();
		Transport transport2 = LogisticsFactory.choseLogistics(LogisticsType.SEA).createTransport();

		List<Transport> usedTransports = List.of(transport1, transport2);

		// then
		usedTransports.forEach(transport -> {
			assertThat(transport.deliver()).contains("Delivering");
		});
	}
}
