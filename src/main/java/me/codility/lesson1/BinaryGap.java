package me.codility.lesson1;

public class BinaryGap {
    public int solution(int N) {
        final String binaryString = Integer.toBinaryString(N);
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                if (cnt > 0) {
                    max = Math.max(max, cnt);
                    cnt = 0;
                }
            } else {
                cnt++;
            }
        }

        return max;
    }
}
