package com.pattern.factory_method;

public class RoadLogistics extends Logistics {

	public Transport createTransport() {
		return new Truck();
	}
}
