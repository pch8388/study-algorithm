package me.study.a_5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int tmp = (s.charAt(i) - 65) / 3;
            int tmp2 = s.charAt(i) - 65;
            if (tmp <= 5) {
                sum += (tmp+3);
            } else if (tmp == 6 || tmp == 7) {
                if (tmp2 % 3 == 0) {
                    sum += (tmp+2);
                } else {
                    sum += (tmp+3);
                }
            } else {
                sum += (tmp+2);
            }
        }
        System.out.println(sum);
    }
}
