package me.boj.bruteforce.ps_1759;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Encrypt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<String> strings = new ArrayList<>();
        while (c-- > 0) {
            strings.add(st.nextToken());
        }

        Collections.sort(strings);
        solve(l, strings, "", 0);

    }

    static void solve(int l, List<String> strings, String password, int index) {
        if (password.length() == l) {
            if (check(password)) {
                System.out.println(password);
            }
            return;
        }

        if (index >= strings.size()) {
            return;
        }

        solve(l, strings, password + strings.get(index), index + 1);
        solve(l, strings, password, index + 1);
    }

    private static boolean check(String password) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if ('a' == ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch) {
                x++;
            } else {
                y++;
            }
        }
        return x >= 1 && y >= 2;
    }
}
