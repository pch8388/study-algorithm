package me.boj.math.ps_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SearchPrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int result = 0;
        while (st.hasMoreTokens()) {
            if (search(Integer.parseInt(st.nextToken()))) {
                result++;
            }
        }
        System.out.println(result);
    }

    private static boolean search(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
