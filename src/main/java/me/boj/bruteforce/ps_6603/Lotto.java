package me.boj.bruteforce.ps_6603;

import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            k = sc.nextInt();
            if (k == 0) {
                System.out.println(sb);
                return;
            }

            numbers = new int[k];
            for (int i = 0; i < k; i++) {
                numbers[i] = sc.nextInt();
            }
            visited = new boolean[k];

            dfs(0, 0);
            sb.append("\n");
        }
    }

    static int k;
    static int[] numbers;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int v, int idx) {
        if (idx == 6) {
            for (int i = 0; i < k; i++) {
                if(visited[i]) {
                    sb.append(numbers[i]).append(" ");
                }
            }
            sb.append("\n");
        }

        for (int i = v; i < k; i++) {
            visited[i] = true;
            dfs(i + 1, idx + 1);
            visited[i] = false;
        }

    }
}
