package me.study.a_10039;

import java.util.Scanner;

public class algo10039 {
    public static void main(String[] args) {
        int[] a = new int[5];

        Scanner s = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(s.nextLine());
            if (a[i] < 40) {
                a[i] = 40;
            }
            sum += a[i];
        }

        System.out.println(sum/5);
    }

}
