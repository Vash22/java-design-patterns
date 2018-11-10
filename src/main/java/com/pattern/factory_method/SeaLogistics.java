package com.pattern.factory_method;

public class SeaLogistics extends Logistics {

	public Transport createTransport() {
		return new Ship();
	}
}
