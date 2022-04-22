package me.leetcode;

import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, 0, target, new ArrayList<>(), result);

        return new ArrayList<>(result);
    }

    void dfs(int[] nums, int start, int target, List<Integer> r, List<List<Integer>> result) {

        if (r.size() >= 4) {
            if (target == 0) {
                result.add(new ArrayList<>(r));
            }
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;

            r.add(nums[i]);
            dfs(nums, i + 1, target - nums[i], r, result);
            r.remove(r.size() - 1);
        }
    }
}
