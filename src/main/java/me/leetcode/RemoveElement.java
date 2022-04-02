package me.leetcode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        int count = 0;
        int[] p = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                count++;
                p[index++] = nums[i];
            }
        }

        for (int i = 0; i < count; i++) {
            nums[i] = p[i];
        }
        for (int i = 0; i < count; i++) {
            System.out.println(nums[i]);
        }
        return count;
    }
}
