package me.study.a_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        bf.close();
        for (int i = 97; i < 123; i++) {
            System.out.print(s.indexOf(i) + " ");
        }
    }
}
