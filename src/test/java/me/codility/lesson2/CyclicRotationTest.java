package me.codility.lesson2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CyclicRotationTest {

	@Test
	public void solve() {
		CyclicRotation r = new CyclicRotation();

		final int[] r1 = r.solution(new int[]{3, 8, 9, 7, 6}, 3);
		final int[] r2 = r.solution(new int[]{0, 0, 0}, 1);
		final int[] r3 = r.solution(new int[]{1, 2, 3, 4}, 4);
		final int[] r4 = r.solution(new int[]{}, 4);

		assertThat(r1).containsExactly(9, 7, 6, 3, 8);
		assertThat(r2).containsExactly(0, 0, 0);
		assertThat(r3).containsExactly(1, 2, 3, 4);
		assertThat(r4).containsExactly();
	}
}