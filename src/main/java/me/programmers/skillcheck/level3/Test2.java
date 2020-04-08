package me.programmers.skillcheck.level3;

import java.util.Arrays;

public class Test2 {
    public int solution(int[] weight) {
        Arrays.sort(weight);

        if (weight[0] != 1) return 1;
        int[] sum = new int[weight.length];
        int tmp = 0;
        for (int i = 0; i < weight.length; i++) {
            tmp += weight[i];
            sum[i] = tmp;
            if (i < weight.length - 1 && sum[i] + 1 < weight[i + 1]) {
                return sum[i] + 1;
            }
        }

        return sum[sum.length - 1] + 1;
    }

}

