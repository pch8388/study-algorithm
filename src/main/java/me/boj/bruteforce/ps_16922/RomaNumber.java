package me.boj.bruteforce.ps_16922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RomaNumber {
    static int[] numbers = {1, 5, 10, 50};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        check = new boolean[50 * 20 + 1];
        cnt = 0;
        dfs(n, 0, 0, 0);
        System.out.println(cnt);
    }

    static boolean[] check;
    static int cnt;

    static void dfs(int n, int depth, int x, int sum) {
        if (n == depth) {
            if (!check[sum]) {
                check[sum] = true;
                cnt++;
            }
            return;
        }

        for (int i = x; i < 4; i++) {
            dfs(n, depth + 1, i, sum + numbers[i]);
        }
    }
}
