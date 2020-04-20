package me.boj.bruteforce.ps_2231;

import java.util.Scanner;

public class Q2231 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n < 11) {
            System.out.println(0);
            return;
        }

        for (int i = 10; i < n; i++) {
            int temp = i;
            int sum = i;
            while (temp != 0) {
                sum += temp % 10;
                temp = temp / 10;
            }

            if (sum == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
