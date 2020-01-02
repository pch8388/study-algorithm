package me.study.algo_1074;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ZSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int[] arr = new int[3];
        for (int i = 0; st.hasMoreTokens(); ) {
            arr[i++] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(arr[0], arr[1], arr[2]));

    }

    static int solve(int n, int r, int c) {
        int ans = 0;
        int y = (int) Math.pow(2, n) / 2;
        int x = y;

        while (n-- > 0) {
            int temp = (int) Math.pow(2, n) / 2;
            int skip = (int) Math.pow(4, n);

            if (r < y && c < x) {
                x -= temp;
                y -= temp;
            } else if (r < y && x <= c) {
                x += temp;
                y -= temp;
                ans += skip;
            } else if (y <= r && c < x) {
                x -= temp;
                y += temp;
                ans += skip * 2;
            } else {
                x += temp;
                y += temp;
                ans += skip * 3;
            }
        }
        return ans;
    }

}
