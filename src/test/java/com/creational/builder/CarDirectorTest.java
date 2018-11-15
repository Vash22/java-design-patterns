package com.creational.builder;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarDirectorTest {

	@Test
	public void constructStandardCarProperlyCreated() {
		// given
		CarDirector carDirector = new CarDirector();

		// when
		Car standardCar = carDirector.constructStandardCar();

		// then
		assertThat(standardCar.getGpsNavigator().getType()).isEqualTo(GPSNavigatorType.STANDARD);
		assertThat(standardCar.isAirConditioning()).isFalse();
	}

	@Test
	public void constructFlagshipCarProperlyCreated() {
		// given
		CarDirector carDirector = new CarDirector();

		// when
		Car flagshipCar = carDirector.constructFlagshipCar();

		// then
		assertThat(flagshipCar.getGpsNavigator().getType()).isEqualTo(GPSNavigatorType.NEWEST);
		assertThat(flagshipCar.isAirConditioning()).isTrue();
	}
}