package me.codility.lesson4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FrogRiverOneTest {

	@Test
	public void solve() {
		FrogRiverOne f = new FrogRiverOne();
		final int r1 = f.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4});
		final int r2 = f.solution(1, new int[]{1});
		final int r3 = f.solution(10, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

		assertThat(r1).isEqualTo(6);
		assertThat(r2).isEqualTo(0);
		assertThat(r3).isEqualTo(9);
	}
}