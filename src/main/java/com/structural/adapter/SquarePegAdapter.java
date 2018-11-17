package com.structural.adapter;

public class SquarePegAdapter extends RoundPeg {

	private SquarePeg squarePeg;

	public SquarePegAdapter(SquarePeg squarePeg) {
		this.squarePeg = squarePeg;
	}

	@Override
	public double getRadius() {
		return (Math.sqrt(squarePeg.calculateSquare() + squarePeg.calculateSquare()));
	}
}
