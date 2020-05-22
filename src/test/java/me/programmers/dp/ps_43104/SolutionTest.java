package me.programmers.dp.ps_43104;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

	@Test
	public void solve() {
		Solution s = new Solution();
		final long r1 = s.solution(5);
		final long r2 = s.solution(6);

		assertThat(r1).isEqualTo(26);
		assertThat(r2).isEqualTo(42);
	}
}