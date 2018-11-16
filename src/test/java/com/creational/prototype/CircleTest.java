package com.creational.prototype;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CircleTest {

	@Test
	public void copyUsedAndIdenticalCircleWasMade() {
		// given
		Circle circle = new Circle();
		circle.setX(10);
		circle.setY(20);
		circle.setRadius(4);

		// when
		Circle circleCopy = (Circle) circle.copy();

		// then
		assertThat(circleCopy).isEqualToComparingFieldByField(circle);
		assertThat(circleCopy).isNotSameAs(circle);
	}
}
