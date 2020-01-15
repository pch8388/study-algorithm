package me.boj.dp.ps_11726;

import java.util.Scanner;

public class Tile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(new Tiles(n).cal(n));
    }

    static class Tiles {
        int[] arr;

        Tiles(int n) {
            arr = new int[n + 1];
        }

        public int cal(int n) {
            arr[0] = 1;
            arr[1] = 1;

            // D[n] = D[n-1] + D[n-2]
            for (int i = 2; i <= n; i++) {
                arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
            }
            return arr[n];
        }
    }
}
