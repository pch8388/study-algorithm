package me.boj.bruteforce.ps_7568;

import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[][] spec = new int[num][2];
        int[] rank = new int[num];

        for (int i = 0; i < num; i++) {
            rank[i] = 1;
            spec[i][0] = sc.nextInt();
            spec[i][1] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (spec[i][0] > spec[j][0] && spec[i][1] > spec[j][1]) {
                    rank[j]++;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(rank[i] + " ");
        }
    }
}
