package me.boj.math.ps_1712;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        long r = b >= c ? -1 : a / (c - b) + 1;
        System.out.println(r);
    }
}
