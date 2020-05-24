package me.programmers.bruteforce.ps_12946;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HanoiTest {

	@Test
	public void solve() {
		Hanoi h = new Hanoi();
		final int[][] r1 = h.solution(2);

		assertThat(r1).containsExactly(new int[]{1, 2}, new int[]{1, 3}, new int[]{2, 3});
	}
}