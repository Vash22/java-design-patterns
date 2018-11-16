package com.creational.singleton;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InitializerTest {

	@Test
	public void getInstance_invokedTwoTimesAndSameInstanceReturned() {
		// when
		Initializer one = Initializer.getInstance("One");
		Initializer two = Initializer.getInstance("Two");

		// then
		assertThat(one).isSameAs(two);
	}
}