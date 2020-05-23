package me.test.test03;

public class Test03 {
    public int solution(String S) {
        // write your code in Java SE 8
        final String[] split = S.split("\\.!?");
        final int len = split.length;

        int max = 0;
        for (int i = 0; i < len; i++) {
            final String[] strings = split[i].split(" ");
            int cnt = 0;
            for (int j = 0; j < strings.length; j++) {
                if (!strings[j].isEmpty()) {
                    cnt++;
                }
            }
            max = Math.max(max, cnt);
        }
        return max;
    }
}
