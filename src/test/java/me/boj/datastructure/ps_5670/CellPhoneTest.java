package me.boj.datastructure.ps_5670;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CellPhoneTest {

	@Test
	public void solve() {
		String[] s = {"hello", "hell", "heaven", "goodbye"};
		final double r1 = CellPhone.findDictionaryCount(s);

		assertThat(r1).isEqualTo(2.00);
	}
}