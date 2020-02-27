package me.boj.bruteforce.ps_15661;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class LinkAndStart {

    static int n;
    static int[][] s;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        s = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                s[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        System.out.println(solve(0, first, second));
    }

    static int solve(int index, ArrayList<Integer> first, ArrayList<Integer> second) {
        if (index == n) {
            if (first.size() == n || second.size() == n) {
                return -1;
            }

            int t1 = 0;
            int t2 = 0;
            for (int i = 0; i < first.size(); i++) {
                for (int j = 0; j < first.size(); j++) {
                    if (i == j) continue;
                    t1 += s[first.get(i)][first.get(j)];
                }
            }
            for (int i = 0; i < second.size(); i++) {
                for (int j = 0; j < second.size(); j++) {
                    if (i == j) continue;
                    t2 += s[second.get(i)][second.get(j)];
                }
            }

            return Math.abs(t1 - t2);
        }

        if (index > n) return -1;

        int ans = -1;

        first.add(index);
        int t1 = solve(index + 1, first, second);
        if (ans == -1 || (t1 != -1 && ans > t1)) {
            ans = t1;
        }
        first.remove(first.size() - 1);

        second.add(index);
        int t2 = solve(index + 1, first, second);
        if (ans == -1 || (t2 != -1 && ans > t2)) {
            ans = t2;
        }
        second.remove(second.size() - 1);

        return ans;
    }
}
