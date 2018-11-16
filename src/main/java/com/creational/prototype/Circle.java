package com.creational.prototype;

public class Circle extends Shape {

	private int radius;

	public Circle() {
	}

	private Circle(Circle circle) {
		super(circle);
		this.radius = circle.getRadius();
	}

	@Override
	public Shape copy() {
		return new Circle(this);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
