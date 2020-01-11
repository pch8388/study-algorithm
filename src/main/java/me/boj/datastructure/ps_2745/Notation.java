package me.boj.datastructure.ps_2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Notation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        String input = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        int result = 0;

        int length = input.length();
        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if (c >= 65 && c <= 90) {
                int a = (int) c - '7';
                result += a * ((int) Math.pow(n, (length - i - 1)));
            } else {
                int a = (int) c - '0';
                result += a * ((int) Math.pow(n, (length - i - 1)));
            }
        }
        System.out.println(result);
        reader.close();
    }
}
