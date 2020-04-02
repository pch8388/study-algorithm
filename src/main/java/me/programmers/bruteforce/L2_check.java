package me.programmers.bruteforce;

import java.util.Arrays;

public class L2_check {
    public String solution(String s) {
        String[] st = s.split(" ");
        int len = st.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(st[i]);
        }
        Arrays.sort(arr);
        return arr[0] + " " + arr[len - 1];
    }
}
