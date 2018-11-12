package com.creational.abstract_factory;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AbstractFactoryTest {

	@Test
	public void usingAbstractFactoryPatternWithClassicFurniture() {
		// given
		FurnitureAbstractFactory furnitureFactory = new ClassicFurnitureFactory();

		// when
		Chair chair = furnitureFactory.createChair();
		CoffeeTable coffeeTable = furnitureFactory.createCoffeeTable();
		Sofa sofa = furnitureFactory.createSofa();

		// then
		assertThat(chair).hasSameClassAs(new ClassicChair());
		assertThat(coffeeTable).hasSameClassAs(new ClassicCoffeeTable());
		assertThat(sofa).hasSameClassAs(new ClassicSofa());
	}

	@Test
	public void usingAbstractFactoryPatternWithOtherFurniture() {
		// given
		FurnitureAbstractFactory furnitureFactory = new ModernFurnitureFactory();

		// when
		Chair chair = furnitureFactory.createChair();

		// then
		assertThat(chair).doesNotHaveSameClassAs(new ClassicChair());
	}
}