package me.boj.datastructure.ps_17087;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] arr2 = new int[n];
        arr2[0] = Math.abs(s - arr[0]);
        for (int i = 1; i < n; i++) {
            arr2[i] = Math.abs(arr[i - 1] - arr[i]);
        }

        int gcd = arr2[0];
        for (int i = 1; i < n; i++) {
            int a = Math.max(gcd, arr2[i]);
            int b = Math.min(gcd, arr2[i]);
            gcd = gcd(a, b);
        }
        System.out.println(gcd);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
