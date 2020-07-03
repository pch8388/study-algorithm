package me.boj.etc.ps_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        int k1 = x * (y % 10);
        int k2 = x * (y % 100 - y % 10);
        int k3 = x * (y / 100 * 100);

        System.out.println(k1);
        System.out.println(k2 / 10);
        System.out.println(k3 / 100);
        System.out.println(k1 + k2 + k3);
    }
}
