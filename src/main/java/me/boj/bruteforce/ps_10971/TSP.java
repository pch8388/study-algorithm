package me.boj.bruteforce.ps_10971;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TSP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        int ans = Integer.MAX_VALUE;
        do {
            boolean ok = true;
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                if (a[arr[i]][arr[i + 1]] == 0) {
                    ok = false;
                } else {
                    sum += a[arr[i]][arr[i + 1]];
                }
            }
            if (ok && a[arr[n - 1]][arr[0]] != 0) {
                sum += a[arr[n - 1]][arr[0]];
                if (ans > sum) {
                    ans = sum;
                }
            }
        } while (nextPermutation(arr));

        System.out.println(ans);
    }

    static boolean nextPermutation(int[] arr) {
        int len = arr.length;

        int i = len - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) i--;
        if (i <= 0) return false;

        int j = len - 1;
        while (j > 0 && arr[i - 1] >= arr[j]) j--;

        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        j = len - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return true;
    }
}
