package me.study.a_2747;

import java.util.Scanner;

public class Algo2747 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[45];
        arr[0] = 1; arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[n-1]);
    }
}
