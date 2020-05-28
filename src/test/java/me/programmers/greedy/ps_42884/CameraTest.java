package me.programmers.greedy.ps_42884;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CameraTest {

	@Test
	public void solve() {
		Camera c = new Camera();
		final int r1 = c.solution(new int[][]{{-20, 15}, {-14, -5}, {-18, -13}, {-5, -3}});

		assertThat(r1).isEqualTo(2);
	}
}