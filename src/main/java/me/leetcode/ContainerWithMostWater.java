package me.leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            max = Math.max(max, Math.min(height[l], height[r]) * (r - 1));
            if (height[l] < height[r]) l++;
            else r--;
        }
        return max;
    }
}
