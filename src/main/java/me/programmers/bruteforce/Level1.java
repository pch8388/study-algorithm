package me.programmers.bruteforce;

import java.util.Arrays;

public class Level1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
    }

    static int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int len = answers.length;

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for (int i = 0; i < len; i++) {
            if (answers[i] == a[i % 5]) c1++;
            if (answers[i] == b[i % 8]) c2++;
            if (answers[i] == c[i % 10]) c3++;
        }

        int max = Math.max(Math.max(c1, c2), c3);

        if (max == c1 && max == c2 && max == c3) return new int[]{1, 2, 3};
        if (max == c1 && max == c2) return new int[]{1, 2};
        if (max == c1 && max == c3) return new int[]{1, 3};
        if (max == c2 && max == c3) return new int[]{2, 3};
        if (max == c1) return new int[]{1};
        if (max == c2) return new int[]{2};

        return new int[]{3};

    }

}
