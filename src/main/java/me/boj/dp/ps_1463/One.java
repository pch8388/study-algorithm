package me.boj.dp.ps_1463;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(new Calculate(n).cal(n));
    }

    static class Calculate {
        int[] arr;

        Calculate(int n) {
            arr = new int[n + 1];
        }

        int cal(int n) {
            if (n == 1) return 0;

            if(arr[n] > 0) return arr[n];

            arr[n] = cal(n - 1) + 1;
            if (n % 2 == 0) {
                int temp = cal(n / 2) + 1;
                if (arr[n] > temp) {
                    arr[n] = temp;
                }
            }

            if (n % 3 == 0) {
                int temp = cal(n / 3) + 1;
                if (arr[n] > temp) {
                    arr[n] = temp;
                }
            }

            return arr[n];
        }
    }

}
