package me.boj.divide.ps_1629;

import java.util.Scanner;

public class Mutiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        C = sc.nextLong();

        System.out.println(pow(A, B));
    }

    static long C;
    static long pow(long a, long b) {
        if (b == 0) {
            return 1;
        }

        long n = pow(a, b / 2);
        long temp = n * n % C;

        if (b % 2 == 0) {
            return temp;
        } else {
            return a * temp % C;
        }
    }
}
