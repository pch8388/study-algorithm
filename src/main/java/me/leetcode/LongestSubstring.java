package me.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		Queue<Integer> check = new LinkedList<>();

		int max = 0;
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (check.contains(s.charAt(i) - 'a')) {
				cnt = check.size();
				max = Math.max(max, cnt);
				while (check.contains(s.charAt(i) - 'a')) {
					check.poll();
				}
			}

			check.add(s.charAt(i) - 'a');

		}
		return Math.max(check.size(), max);
	}
}
