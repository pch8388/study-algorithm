package me.codility.lesson4;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        final int[] ints = new int[N];

        final int length = A.length;
        int max = 0;
        int lmax = 0;
        for (int i = 0; i < length; i++) {
            final int x = A[i] - 1;
            if (x < N) {
                if (ints[x] < lmax) {
                    ints[x] = lmax + 1;
                } else {
                    ints[x]++;
                }

                if (ints[x] > max) {
                    max = ints[x];
                }
            } else if (x == N) {
                lmax = max;
            }
        }

        for (int i = 0; i < N; i++) {
            if (ints[i] < lmax) {
                ints[i] = lmax;
            }
        }

        return ints;
    }
}
