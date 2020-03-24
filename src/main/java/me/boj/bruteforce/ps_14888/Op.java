package me.boj.bruteforce.ps_14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Op {

    static int n;
    static int[] num;
    static int[] op;
    static boolean[] check;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        num = new int[n];
        check = new boolean[n - 1];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(s[i]);
        }

        s = br.readLine().split(" ");
        int idx = 0;
        op = new int[n - 1];
        for (int i = 0; i < 4; i++) {
            int cnt = Integer.parseInt(s[i]);
            for (int j = 0; j < cnt; j++) {
                op[idx++] = i + 1;
            }
        }

        dfs(0, 1, num[0]);
        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int v, int index, int sum) {
        int result = 0;

        if (index == n) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            check[v] = false;
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (check[i]) continue;
            switch (op[i]) {
                case 1:
                    result = sum + num[index];
                    break;
                case 2:
                    result = sum - num[index];
                    break;
                case 3:
                    result = sum * num[index];
                    break;
                case 4:
                    result = sum / num[index];
                    break;
            }
            check[i] = true;
            dfs(i, index + 1, result);
        }

        check[v] = false;
    }
}
