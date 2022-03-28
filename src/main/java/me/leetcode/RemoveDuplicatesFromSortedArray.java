package me.leetcode;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int preNum = nums[0];
        int idx = 0;
        if (nums.length == 1) return count;

        for (int i = 1; i < nums.length; i++) {
            if (preNum != nums[i]) {
                preNum = nums[i];
                count++;
                nums[++idx] = preNum;
            }
        }

        return count;
    }
}
