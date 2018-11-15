package com.creational.builder;

public class CarDirector {

	public Car constructStandardCar() {
		return new Car.Builder(CarType.SEDAN, Engine.SLOW, Transmission.MANUAL).build();
	}

	public Car constructFlagshipCar() {
		return new Car.Builder(CarType.PICKUP, Engine.FAST, Transmission.AUTOMATIC).withAirConditioning(true)
				.withGPSNavigator(new GPSNavigator(GPSNavigatorType.NEWEST)).build();
	}
}
