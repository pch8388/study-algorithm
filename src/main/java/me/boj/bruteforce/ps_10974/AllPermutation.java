package me.boj.bruteforce.ps_10974;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllPermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        StringBuilder builder = new StringBuilder();
        do {
            for (int i = 0; i < n; i++) {
                builder.append(arr[i]).append(" ");
            }
            builder.append("\n");
        } while(nextPermutation(n, arr));

        System.out.println(builder);
    }

    static boolean nextPermutation(int n, int[] arr) {
        int i = n - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) i--;
        if (i <= 0) return false;

        int j = n - 1;
        while (j > 0 && arr[i - 1] >= arr[j]) j--;

        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        j = n - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        return true;
    }
}
