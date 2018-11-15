package com.creational.builder;

public class Car {
	private final CarType carType;
	private final Engine engine;
	private final Transmission transmission;
	private final GPSNavigator gpsNavigator;
	private final boolean airConditioning;

	private Car(Builder builder) {
		this.carType = builder.carType;
		this.engine = builder.engine;
		this.transmission = builder.transmission;
		this.gpsNavigator = builder.gpsNavigator;
		this.airConditioning = builder.airConditioning;
	}

	public CarType getCarType() {
		return carType;
	}

	public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}

	public boolean isAirConditioning() {
		return airConditioning;
	}

	public static class Builder {
		private final CarType carType;
		private final Engine engine;
		private final Transmission transmission;
		private GPSNavigator gpsNavigator = new GPSNavigator(GPSNavigatorType.STANDARD);
		private boolean airConditioning;

		public Builder(CarType carType, Engine engine, Transmission transmission) {
			this.carType = carType;
			this.engine = engine;
			this.transmission = transmission;
		}

		public Builder withGPSNavigator(GPSNavigator gpsNavigator) {
			this.gpsNavigator = gpsNavigator;
			return this;
		}

		public Builder withAirConditioning(boolean airConditioning) {
			this.airConditioning = airConditioning;
			return this;
		}

		public CarType getCarType() {
			return carType;
		}

		public Car build() {
			return new Car(this);
		}
	}
}
