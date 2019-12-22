package me.study.algo_10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        int[] result = sort(arr);
        StringBuilder st = new StringBuilder();
        for (int i : result) {
            st.append(i).append("\n");
        }
        System.out.println(st);
        bf.close();
    }

    public static int[] sort(int[] arr) {
        int[] tempArr = new int[10001];
        for (int value : arr) {
            tempArr[value]++;
        }

        int[] result = new int[arr.length];
        int index = 0;
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] > 0) {
                for (int j = 0; j < tempArr[i]; j++) {
                    result[index++] = i;
                }
            }
        }

        return result;
    }

}
