package me.boj.dp.ps_1912;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ContinusSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(solve(arr));
    }

    static int solve(int[] arr) {
        int len = arr.length;
        int[] d = new int[len];

        d[0] = arr[0];
        for (int i = 1; i < len; i++) {
            d[i] = Math.max(d[i - 1] + arr[i], arr[i]);
        }

        Arrays.sort(d);
        return d[len - 1];
    }
}
