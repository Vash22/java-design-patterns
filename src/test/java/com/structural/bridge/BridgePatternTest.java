package com.structural.bridge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BridgePatternTest {

	@Test
	public void usingBridgeForMixingHierarchies() {
		// given
		Tv tv = new Tv();
		BasicRemote basicRemoteUsedForTv = new BasicRemote(tv);
		AdvancedRemote advancedRemoteUsedForTv = new AdvancedRemote(tv);

		// when
		basicRemoteUsedForTv.volumeUp();
		advancedRemoteUsedForTv.mute();

		// then
		assertThat(tv.getVolume()).isEqualTo(0);
	}
}