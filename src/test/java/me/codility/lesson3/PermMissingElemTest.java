package me.codility.lesson3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PermMissingElemTest {

	@Test
	public void solve() {
		PermMissingElem p = new PermMissingElem();

		final int r1 = p.solution(new int[]{2, 3, 1, 5});

		assertThat(r1).isEqualTo(4);
	}
}