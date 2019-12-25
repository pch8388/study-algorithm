package me.study.a_2577;

import java.util.Scanner;

public class Algo2577 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());

        String r = String.valueOf(a*b*c);
        int[] arr = new int[10];
        for (int i = 0; i < r.length(); i++) {
            arr[Character.getNumericValue(r.charAt(i))]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
