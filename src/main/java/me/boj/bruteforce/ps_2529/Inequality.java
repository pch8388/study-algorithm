package me.boj.bruteforce.ps_2529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Inequality {

    static int n;
    static char[] chars;
    static boolean[] booleans = new boolean[10];
    static ArrayList<String> ans = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        chars = new char[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            chars[i] = st.nextToken().charAt(0);
        }

        solve(0, "");
        Collections.sort(ans);
        System.out.println(ans.get(ans.size() - 1));
        System.out.println(ans.get(0));
    }

    static void solve(int index, String num) {
        if (index == n + 1) {
            if (ok(num)) {
                ans.add(num);
            }
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (booleans[i]) continue;
            booleans[i] = true;
            solve(index + 1, num + i);
            booleans[i] = false;
        }

    }

    static boolean ok(String num) {
        for (int i = 0; i < n; i++) {
            if (chars[i] == '<') {
                if (num.charAt(i) > num.charAt(i + 1)) return false;
            } else if (chars[i] == '>') {
                if (num.charAt(i) < num.charAt(i + 1)) return false;
            }
        }

        return true;
    }
}
