package me.leetcode;

import java.util.Arrays;

public class MissingInteger {
    public int solution(int[] A) {
        Arrays.sort(A);

        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 0) continue;
            if (A[i] == index + 1) {
                index++;
            } else if(A[i] != index) {
                return ++index;
            }
        }
        return ++index;
    }
}
