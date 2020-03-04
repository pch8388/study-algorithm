package me.boj.math.ps_2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        double a = Double.parseDouble(st[0]);
        double v = Double.parseDouble(st[1]);
        double b = Double.parseDouble(st[2]);

        if (a == b) {
            System.out.println(1);
        } else {
            System.out.println((long)Math.ceil((b - a) / (a - v)) + 1);
        }
    }
}
