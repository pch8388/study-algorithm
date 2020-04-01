package me.boj.bruteforce.ps_15658;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Op {

    static int n;
    static int[] numbers;
    static int[] op = new int[4];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }

        dfs(1, numbers[0], op[0], op[1], op[2], op[3]);
        System.out.println(max);
        System.out.println(min);
    }

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static void dfs(int index, int sum, int plus, int minus, int multi, int div) {
        if (index == n) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);

            return;
        }

        if(plus > 0) dfs(index + 1, sum + numbers[index], plus - 1, minus, multi, div);
        if(minus > 0) dfs(index + 1, sum - numbers[index], plus, minus - 1, multi, div);
        if(multi > 0) dfs(index + 1, sum * numbers[index], plus, minus, multi - 1, div);
        if(div > 0) dfs(index + 1, sum / numbers[index], plus, minus, multi, div - 1);

    }
}
