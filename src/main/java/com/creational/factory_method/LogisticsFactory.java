package com.creational.factory_method;

public class LogisticsFactory {

	private LogisticsFactory() {
		// only static members
	}

	public static Logistics choseLogistics(LogisticsType logisticsType) {
		switch (logisticsType) {
		case ROAD:
			return new RoadLogistics();
		case SEA:
			return new SeaLogistics();
		default:
			return new RoadLogistics();
		}
	}
}
