package me.programmers.kakao.ps_64603;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HotelRoomTest {

	@Test
	public void solve() {
		HotelRoom h = new HotelRoom();
		final long[] r1 = h.solution(10, new long[]{1, 3, 4, 1, 3, 1});

		assertThat(r1).containsExactly(1, 3, 4, 2, 5, 6);
	}
}