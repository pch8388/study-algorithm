package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

	@Test
	public void solve() {
		TwoSum t = new TwoSum();
		final int[] result = t.twoSum(new int[]{2, 7, 11, 15}, 9);

		assertThat(result).containsExactly(0, 1);
	}
}