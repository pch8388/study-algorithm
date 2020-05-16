package me.boj.dp.ps_1904;

import java.util.Scanner;

public class Tile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    static long solve(int n) {
        long[] arr = new long[1000001];
        arr[1] = 1;
        arr[2] = 2;

        long mod = 15746L;

        if (n < 3) {
            return arr[n];
        }

        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % mod;
        }
        return arr[n];
    }
}
