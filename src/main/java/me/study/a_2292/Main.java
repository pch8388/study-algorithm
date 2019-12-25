package me.study.a_2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int i = 0;
        int t = 1;
        while(true) {
            t = t + 6 * i;
            if (n <= t) {
                System.out.println(i+1);
                break;
            }
            i++;
        }
        bf.close();
    }
}
