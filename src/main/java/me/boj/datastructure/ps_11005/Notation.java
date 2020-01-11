package me.boj.datastructure.ps_11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Notation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        System.out.println(notation(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }

    static String notation(int n, int b) {
        char[] arr = new char[100];
        int count = 0;
        while (n != 0) {
            int mod = n % b;
            if (mod > 9) {
                arr[count++] = (char) (mod + 55);
            } else {
                arr[count++] = (char) (mod + '0');
            }
            n /= b;
        }

        StringBuilder st = new StringBuilder();
        for (int i = count - 1; i >= 0; i--) {
            st.append(arr[i]);
        }
        return st.toString();
    }
}
