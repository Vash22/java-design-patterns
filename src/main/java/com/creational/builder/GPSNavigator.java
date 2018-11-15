package com.creational.builder;

public class GPSNavigator {
	private static final String NAVIGATING = "Navigating";

	private final GPSNavigatorType type;

	public GPSNavigator(GPSNavigatorType type) {
		this.type = type;
	}

	public GPSNavigatorType getType() {
		return type;
	}

	public String navigate() {
		return NAVIGATING;
	}
}
