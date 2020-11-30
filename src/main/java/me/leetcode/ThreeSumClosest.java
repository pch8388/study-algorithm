package me.leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
		int len = nums.length;
		if (len == 3) return nums[0] + nums[1] + nums[2];

		Arrays.sort(nums);
		int min = 0;
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				for (int k = j + 1; k < len; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if (Math.abs(target - sum) < Math.abs(diff)) {
						min = sum;
						diff = Math.abs(target - sum);
					}
				}
			}
		}
		return min;
	}
}
