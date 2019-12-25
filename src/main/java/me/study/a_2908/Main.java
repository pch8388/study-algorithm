package me.study.a_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        bf.close();
        StringTokenizer st = new StringTokenizer(s, " ");
        int[] arr = new int[2];
        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        }
        System.out.println(Math.max(arr[0], arr[1]));
    }
}