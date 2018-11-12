package com.creational.abstract_factory;

public class ClassicFurnitureFactory implements FurnitureAbstractFactory {

	@Override
	public Chair createChair() {
		return new ClassicChair();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new ClassicCoffeeTable();
	}

	@Override
	public Sofa createSofa() {
		return new ClassicSofa();
	}
}
