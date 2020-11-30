package me.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThreeSumClosestTest {

	@Test
	void solve() {
		ThreeSumClosest s = new ThreeSumClosest();
		final int r1 = s.threeSumClosest(new int[] {-1, 2, 1, -4}, 1);
		final int r2 = s.threeSumClosest(new int[] {5, 3, -2, -1, 10}, 3);

		assertThat(r1).isEqualTo(2);
		assertThat(r2).isEqualTo(2);
	}
}