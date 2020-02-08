package me.boj.bruteforce.ps_1476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Month {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(solve(Integer.parseInt(st.nextToken()),
            Integer.parseInt(st.nextToken()),
            Integer.parseInt(st.nextToken())));
    }

    static int solve(int e, int s, int m) {
        if (e == s && e == m) {
            return e;
        }

        int em = 15;
        int sm = 28;
        int mm = 19;


        int i = 0;
        while (true) {
            int temp = i + s;
            if ((temp % em) == (e % em) && (temp % mm) == (m % mm)) {
                return temp;
            }
            i += sm;
        }
    }
}
