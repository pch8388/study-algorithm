package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseIntegerTest {

	@Test
	public void solve() {
		ReverseInteger r = new ReverseInteger();
		final int r1 = r.reverse(123);
		final int r2 = r.reverse(-321);
		final int r3 = r.reverse(120);
		final int r4 = r.reverse(1534236469);

		assertThat(r1).isEqualTo(321);
		assertThat(r2).isEqualTo(-123);
		assertThat(r3).isEqualTo(21);
		assertThat(r4).isEqualTo(0);
	}
}