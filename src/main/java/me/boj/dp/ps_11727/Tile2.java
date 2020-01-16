package me.boj.dp.ps_11727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tile2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[] arr = new int[1001];
        arr[0] = 1;
        arr[1] = 1;

        //d[n] = 2* d[n-2] + d[n-1];
        for (int i = 2; i <= n; i++) {
            arr[i] = (2 * arr[i - 2] + arr[i - 1]) % 10007;
        }
        System.out.println(arr[n]);
    }
}
