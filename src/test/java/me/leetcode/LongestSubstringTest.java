package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubstringTest {

	@Test
	public void solve() {
		LongestSubstring l = new LongestSubstring();
		final int r1 = l.lengthOfLongestSubstring("abcabcbb");
		final int r2 = l.lengthOfLongestSubstring("bbbbb");
		final int r3 = l.lengthOfLongestSubstring("pwwkew");
		final int r4 = l.lengthOfLongestSubstring(" ");
		final int r5 = l.lengthOfLongestSubstring("c");
		final int r6 = l.lengthOfLongestSubstring("dvdf");

		assertThat(r1).isEqualTo(3);
		assertThat(r2).isEqualTo(1);
		assertThat(r3).isEqualTo(3);
		assertThat(r4).isEqualTo(1);
		assertThat(r5).isEqualTo(1);
		assertThat(r6).isEqualTo(3);
	}
}