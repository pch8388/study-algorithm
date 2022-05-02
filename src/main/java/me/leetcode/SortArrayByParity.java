package me.leetcode;

import java.util.Arrays;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) return nums;

        int[] oddNums = new int[nums.length];
        int oddIndex = 0;
        int[] evenNums = new int[nums.length];
        int evenIndex = 0;
        for (int j : nums) {
            if (j % 2 == 1) {
                oddNums[oddIndex++] = j;
            } else {
                evenNums[evenIndex++] = j;
            }
        }

        int[] result = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < evenIndex; i++) {
            result[idx++] = evenNums[i];
        }
        for (int i = 0; i < oddIndex; i++) {
            result[idx++] = oddNums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = sortArrayByParity(new int[]{3, 1, 2, 4});
        System.out.println(Arrays.toString(ints));
    }
}
