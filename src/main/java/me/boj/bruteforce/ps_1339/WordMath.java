package me.boj.bruteforce.ps_1339;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordMath {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[] alphabet = new char[10];
        int[] weight = new int[10];

        Arrays.fill(alphabet, '0');
        Arrays.fill(weight, 0);

        for (int i = 0; i < N; i++) {

            String numStr = br.readLine();

            int w = 1;
            for (int j = numStr.length() - 1; j >= 0; j--) {

                char numChar = numStr.charAt(j);

                for (int k = 0; k < 10; k++) {
                    if (alphabet[k] == numChar) {
                        weight[k] += w;
                        break;
                    } else if (alphabet[k] == '0') {
                        alphabet[k] = numChar;
                        weight[k] = w;
                        break;
                    }
                }

                w *= 10;
            }
        }

        Arrays.sort(weight);

        int sum = 0;
        for (int i = 9; i >= 0; i--) {

            sum += i * weight[i];
        }

        System.out.println(sum);
    }
}
