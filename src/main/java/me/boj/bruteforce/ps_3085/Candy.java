package me.boj.bruteforce.ps_3085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Candy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        System.out.println(solve(n, arr));
    }

    static int solve(int n, char[][] arr) {

        int max = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j + 1 < n) {
                    char tmp = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = tmp;
                    max = Math.max(max, check(arr));
                    tmp = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = tmp;
                }
                if (i + 1 < n) {
                    char tmp = arr[i][j];
                    arr[i][j] = arr[i + 1][j];
                    arr[i + 1][j] = tmp;
                    max = Math.max(max, check(arr));
                    tmp = arr[i][j];
                    arr[i][j] = arr[i + 1][j];
                    arr[i + 1][j] = tmp;
                }
            }
        }

        return max;
    }

    private static int check(char[][] arr) {
        int max = 1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int cnt1 = 1;
            int cnt2 = 1;
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == arr[i][j - 1]) {
                    cnt1++;
                    if (cnt1 > max) max = cnt1;
                } else {
                    cnt1 = 1;
                }
            }
            for (int j = 1; j < n; j++) {
                if (arr[j][i] == arr[j - 1][i]) {
                    cnt2++;
                    if (cnt2 > max) max = cnt2;
                } else {
                    cnt2 = 1;
                }
            }
        }
        return max;
    }
}
