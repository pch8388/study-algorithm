package me.codility.lesson2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OddOccurrencesInArrayTest {

	@Test
	public void solve() {
		OddOccurrencesInArray o = new OddOccurrencesInArray();
		final int r1 = o.solution(new int[]{9, 3, 9, 3, 9, 7, 9});

		assertThat(r1).isEqualTo(7);
	}
}