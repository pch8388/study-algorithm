package me.study.a_8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String s = bf.readLine();
            int cnt = 0;
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                if('O'==s.charAt(j)) {
                    cnt++;
                    sum += cnt;
                } else {
                    cnt = 0;
                    sum += cnt;
                }
            }
            System.out.println(sum);
        }
    }
}