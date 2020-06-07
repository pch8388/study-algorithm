package me.codility.lesson3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TapeEquilibriumTest {

	@Test
	public void solve() {
		TapeEquilibrium t = new TapeEquilibrium();
		final int r1 = t.solution(new int[]{3, 1, 2, 4, 3});
		final int r2 = t.solution(new int[]{-1000, 0});
		final int r3 = t.solution(new int[]{0, 0});

		assertThat(r1).isEqualTo(1);
		assertThat(r2).isEqualTo(1000);
		assertThat(r3).isEqualTo(0);
	}
}