package me.test.test04;

import java.util.Comparator;
import java.util.stream.IntStream;

public class Test04 {
    public int solution(String S) {
        // write your code in Java SE 8
        final int len = S.length();
        final int[] arr = new int[26];

        for (int i = 0; i < len; i++) {
            arr[S.charAt(i) - 97]++;
        }

        final boolean[] check = new boolean[300001];
        final int[] ints = IntStream.of(arr)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .mapToInt(i -> i)
            .filter(i -> i > 0)
            .toArray();

        int cnt = 0;
        for (int i = 0; i < ints.length; i++) {
            int tmp = ints[i];
            while (check[tmp] && tmp > 0) {
                tmp--;
                cnt++;
            }
            check[tmp] = true;
        }
        return cnt;
    }
}
