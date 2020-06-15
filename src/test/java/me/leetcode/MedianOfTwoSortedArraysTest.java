package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

	@Test
	public void solve() {
		MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();

		final double r1 = m.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
		final double r2 = m.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});

		assertThat(r1).isEqualTo(2.0);
		assertThat(r2).isEqualTo(2.5);
	}
}