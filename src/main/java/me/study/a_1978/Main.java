package me.study.a_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int cnt = 0;
        int result = 0;
        boolean t = true;
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        while(st.hasMoreTokens()) {
            int x = Integer.parseInt(st.nextToken());
            if (x == 1) {
                continue;
            }
            for (int i = 2; i <= x/2; i++) {
                if (x % i == 0) {
                    t = false;
                    break;
                }
            }

            cnt++;

            if (t) result++;
            else t = true;

            if(n <= cnt) break;
        }
        System.out.println(result);
        bf.close();
    }
}
