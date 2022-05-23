package me.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        do {
            List<Integer> l = new ArrayList<>();
            for (int num : nums) {
                l.add(num);
            }
            result.add(l);
        } while (nextPermutation(nums));

        return result;
    }

    boolean nextPermutation(int[] nums) {
        int len = nums.length;

        int i = len - 1;
        while (i > 0 && nums[i - 1] >= nums[i]) i--;

        if (i <= 0) return false;

        int j = len - 1;
        while (j > 0 && nums[i - 1] >= nums[j]) j--;

        int temp = nums[i - 1];
        nums[i - 1] = nums[j];
        nums[j] = temp;

        j = len - 1;
        while (i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        return true;
    }
}
