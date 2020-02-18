package me.boj.bruteforce.ps_10972;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Permutation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder builder = new StringBuilder();

        if (nextPermutation(n, arr)) {
            for (int j = 0; j < n; j++) {
                builder.append(arr[j]).append(" ");
            }
        } else {
            builder.append(-1);
        }
        System.out.println(builder);
    }

    static boolean nextPermutation(int n, int[] arr) {
        int i = n - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) i--;
        if (i <= 0) return false;
        int j = n - 1;
        while (arr[j] <= arr[i - 1]) j--;

        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        j = n - 1;
        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++; j--;
        }

        return true;
    }
}
