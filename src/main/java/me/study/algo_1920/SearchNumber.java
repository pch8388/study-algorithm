package me.study.algo_1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SearchNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        HashSet<Integer> hash = new HashSet<>(N);
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        while (st.hasMoreTokens()) {
            hash.add(Integer.valueOf(st.nextToken()));
        }

        int M = Integer.parseInt(bf.readLine());
        int[] arr = new int[M];
        int i = 0;
        StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");
        while (st2.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(st2.nextToken());
        }

        int[] result = new int[M];
        for (int j = 0; j < arr.length; j++) {
            result[j] = hash.contains(arr[j]) ? 1 : 0;
        }

        Arrays.stream(result).forEach(System.out::println);
    }
}
