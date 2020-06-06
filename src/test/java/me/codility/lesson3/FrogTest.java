package me.codility.lesson3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FrogTest {

	@Test
	public void solve() {
		Frog f = new Frog();

		final int r1 = f.solution(10, 85, 30);
		final int r2 = f.solution(1, 1_000_000_000, 1);

		assertThat(r1).isEqualTo(3);
		assertThat(r2).isEqualTo(999_999_999);
	}
}