package me.boj.bruteforce.ps_10819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int ans = 0;
        do {
            int sum = calculate(arr);
            ans = Math.max(ans, sum);
        } while(nextPermutation(n, arr));

        System.out.println(ans);
    }

    static int calculate(int[] arr) {
        int len = arr.length;

        int sum = 0;
        for (int i = 1; i < len; i++) {
            sum += Math.abs(arr[i] - arr[i - 1]);
        }

        return sum;
    }

    static boolean nextPermutation(int n, int[] arr) {
        int i = n - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) i--;
        if (i <= 0) return false;

        int j = n - 1;
        while (j > 0 && arr[i - 1] >= arr[j]) j--;

        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        j = n - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }

        return true;
    }
}
