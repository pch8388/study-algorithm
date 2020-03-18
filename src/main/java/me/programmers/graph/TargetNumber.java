package me.programmers.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TargetNumber {
    static int[] arr;
    static int n;
    static int cnt = 0;
    static int target = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        target = Integer.parseInt(br.readLine());
        n = strings.length;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }

        dfs(0, 0);
        System.out.println(cnt);
    }

    static void dfs(int index, int sum) {

        int s1 = sum - arr[index];
        int s2 = sum + arr[index];

        if (index == n - 1) {
            if (target == s1 || target == s2) {
                cnt++;
            }
            return;
        }

       dfs(index + 1, s1);
       dfs(index + 1, s2);
    }
}
