package me.programmers.divide.ps_43238;

import java.util.Arrays;

public class Q43238 {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long s = 0;
        long e = ((long)times[times.length - 1]) * n;
        long answer = e;
        while (s <= e) {
            long mid = (s + e) / 2;

            long sum = 0;
            for (int i = 0; i < times.length; i++) {
                sum += mid / times[i];
            }

            if (sum < n) s = mid + 1;
            else {
                if (mid <= answer) answer = mid;
                e = mid - 1;
            }
        }

        return s;
    }
}
