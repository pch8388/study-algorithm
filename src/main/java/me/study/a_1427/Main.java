package me.study.a_1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = bf.readLine().toCharArray();
        int[] arr = new int[10];
        for (int i = 0; i < chars.length; i++) {
            arr[chars[i]-'0']++;
        }
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] != 0) {
                for(int j = 0; j < arr[i]; j++) {
                    System.out.print(i);
                }
            }
        }
        bf.close();
    }
}
