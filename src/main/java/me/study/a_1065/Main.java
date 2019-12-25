package me.study.a_1065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++) {
            if(i < 100) {
                count++;
                continue;
            }
            if(i == 1000) {
                break;
            }
            if((i % 10) - (i/10%10) == (i/10%10) - (i/10/10%10)) {
                count++;
            }
        }
        System.out.println(count);
    }
}