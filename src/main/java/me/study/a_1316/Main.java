package me.study.a_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        char tmp = ' ';
        int result = 0;

        for (int i = 0; i < n; i++) {
            int[] arr = new int[26];
            String s = bf.readLine();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                int t = c-97;
                if (c != tmp && arr[t] > 0) {
                    break;
                }
                tmp = c;
                arr[t]++;
                if (j == s.length() - 1) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
