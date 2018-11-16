package com.creational.singleton;

public final class Initializer {

	private static volatile Initializer instance;
	private final String value;

	private Initializer(String value) {
		this.value = value;
	}

	public static Initializer getInstance(String value) {
		if (instance == null) {
			synchronized (Initializer.class) {
				if (instance == null) {
					instance = new Initializer(value);
				}
			}
		}
		return instance;
	}

	public String getValue() {
		return value;
	}
}
