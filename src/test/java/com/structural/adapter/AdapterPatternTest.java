package com.structural.adapter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdapterPatternTest {

	@Test
	public void squarePegFitsInRoundHole() {
		// given
		RoundHole roundHole = new RoundHole(20);
		SquarePeg squarePeg = new SquarePeg(14);

		// when
		SquarePegAdapter squarePegAdapted = new SquarePegAdapter(squarePeg);

		// then
		assertThat(roundHole.fits(squarePegAdapted)).isTrue();
	}

	@Test
	public void squarePegNotFittingInRoundHole() {
		// given
		RoundHole roundHole = new RoundHole(20);
		SquarePeg squarePeg = new SquarePeg(18);

		// when
		SquarePegAdapter squarePegAdapted = new SquarePegAdapter(squarePeg);

		// then
		assertThat(roundHole.fits(squarePegAdapted)).isFalse();
	}
}