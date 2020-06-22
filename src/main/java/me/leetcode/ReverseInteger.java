package me.leetcode;

public class ReverseInteger {
	public int reverse(int x) {
		if (x == 0) {
			return 0;
		}

		long reverseX = 0;
		while (x != 0) {
			int mod = x % 10;
			x = x / 10;
			reverseX = (reverseX * 10) + mod;
		}

		if (reverseX > Integer.MAX_VALUE || reverseX < Integer.MIN_VALUE) {
			return 0;
		}
		return (int) reverseX;
	}
}
