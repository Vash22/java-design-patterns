package com.pattern.factory_method;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LogisticsFactoryTest {

	@Test
	public void choseLogisticsRoadLogisticsChosen() {
		// given
		LogisticsType road = LogisticsType.ROAD;

		// when
		Logistics logistics = LogisticsFactory.choseLogistics(road);

		// then
		assertThat(logistics).hasSameClassAs(new RoadLogistics());
	}
}
