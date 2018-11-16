package com.creational.prototype;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RectangleTest {

	@Test
	public void copyUsedAndIdenticalRectangleWasMade() {
		// given
		Rectangle rectangle = new Rectangle();
		rectangle.setX(12);
		rectangle.setY(44);
		rectangle.setHeight(4);
		rectangle.setWidth(5);

		// when
		Rectangle rectangleCopy = (Rectangle) rectangle.copy();

		// then
		assertThat(rectangleCopy).isEqualToComparingFieldByField(rectangle);
		assertThat(rectangleCopy).isNotSameAs(rectangle);
	}
}
