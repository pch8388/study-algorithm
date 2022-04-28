package me.leetcode;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;
            max = Math.max(max, sum);

            if (sum < 0) sum = 0;
        }

        return max;
    }
}
