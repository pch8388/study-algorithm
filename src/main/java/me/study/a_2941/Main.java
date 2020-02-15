package me.study.a_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();

        List<String> strings = Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");
        for (String string : strings) {
            s = s.replaceAll(string, "X");
        }

        bf.close();
        System.out.println(s.length());
    }
}
