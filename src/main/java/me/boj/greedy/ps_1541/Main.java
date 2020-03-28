package me.boj.greedy.ps_1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int sum = 0;
        int temp = 0;
        int idx = 0;
        int[] arr = new int[25];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                sum += temp;
                arr[idx++] = sum;
                temp = 0;
                sum = 0;
            } else if (str.charAt(i) == '+') {
                sum += temp;
                temp = 0;
            } else {
                temp *= 10;
                temp += (str.charAt(i) - '0');
            }
        }

        sum += temp;
        arr[idx++] = sum;

        int ans = arr[0];
        for (int i = 1; i < idx; i++) {
            ans -= arr[i];
        }

        System.out.println(ans);
    }

}
