package me.study.a_2490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = new char[3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int r = 0;
            while (st.hasMoreTokens()) {
                r += Integer.parseInt(st.nextToken());
            }

            switch (r) {
                case 0 :
                    chars[i] = 'D';
                    break;
                case 1 :
                    chars[i] = 'C';
                    break;
                case 2 :
                    chars[i] = 'B';
                    break;
                case 3 :
                    chars[i] = 'A';
                    break;
                case 4 :
                    chars[i] = 'E';
                    break;
            }
        }
        for (char c : chars) {
            System.out.println(c);
        }
        bf.close();
    }
}
