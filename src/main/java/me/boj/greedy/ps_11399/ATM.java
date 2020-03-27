package me.boj.greedy.ps_11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(arr);
        int sum = arr[0];
        int acc = arr[0];
        for (int i = 1; i < n; i++) {
            acc += arr[i];
            sum += acc;
        }

        System.out.println(sum);
    }
}
