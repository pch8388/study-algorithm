package me.programmers.bruteforce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HIndexTest {

	@Test
	void solve() {
		HIndex hIndex = new HIndex();
		final int r1 = hIndex.solution(new int[] {3, 0, 6, 1, 5});
		final int r2 = hIndex.solution(new int[] {25, 8, 5, 3, 3});
		final int r3 = hIndex.solution(new int[] {10, 8, 5, 4, 3});
		final int r4 = hIndex.solution(new int[] {5, 5, 5, 5});
		final int r5 = hIndex.solution(new int[] {22, 42});

		assertEquals(3, r1);
		assertEquals(3, r2);
		assertEquals(4, r3);
		assertEquals(4, r4);
		assertEquals(2, r5);
	}
}