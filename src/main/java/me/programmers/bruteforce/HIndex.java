package me.programmers.bruteforce;

import java.util.Arrays;

public class HIndex {
	public int solution(int[] citations) {
		Arrays.sort(citations);
		final int length = citations.length;
		for (int i = 0; i < length; i++) {
			int count = length - i;
			if (citations[i] >= count) {
				return count;
			}
		}
		return 0;
	}
}
