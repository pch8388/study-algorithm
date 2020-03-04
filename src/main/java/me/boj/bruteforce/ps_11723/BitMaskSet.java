package me.boj.bruteforce.ps_11723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitMaskSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int m = 20;
        int s = 0;
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String[] st = br.readLine().split(" ");
            if ("add".equals(st[0])) {
                int x = Integer.parseInt(st[1]) - 1;
                s = (s | (1 << x));
            } else if ("remove".equals(st[0])) {
                int x = Integer.parseInt(st[1]) - 1;
                s = (s & ~(1 << x));
            } else if ("check".equals(st[0])) {
                int x = Integer.parseInt(st[1]) - 1;
                if ((s & (1 << x)) == 0) {
                    sb.append("0\n");
                } else {
                    sb.append("1\n");
                }
            } else if ("toggle".equals(st[0])) {
                int x = Integer.parseInt(st[1]) - 1;
                s = (s ^ (1 << x));
            } else if ("all".equals(st[0])) {
                s = (1 << m) - 1;
            } else {
                s = 0;
            }
        }

        System.out.println(sb);
    }
}
