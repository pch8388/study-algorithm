package me.boj.bruteforce.ps_6064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Calendar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            System.out.println(solve(
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())));
        }
    }

    static int solve(int n, int m, int x, int y) {

        for (int i = x - 1; i < (n * m); i += n) {
            if (i % m == (y - 1)) {
                return i + 1;
            }
        }
        return -1;
    }
}
