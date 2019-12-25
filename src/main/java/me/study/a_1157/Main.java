package me.study.a_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        bf.close();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if (t >= 97 && t <= 122) {
                t = Character.toUpperCase(t);
            }
            map.put(t, map.get(t) == null ? 1 : map.get(t) + 1);
        }
        char maxKey = ' ';
        int maxVal = 0;
        int duplicate = 0;

        for (Character c : map.keySet()) {
            if (maxVal < map.get(c)) {
                maxVal = map.get(c);
                maxKey = c;
                duplicate = 0;
            } else if (maxVal == map.get(c)) {
                duplicate = 1;
            }
        }

        if (duplicate > 0) {
            maxKey = '?';
        }

        System.out.println(maxKey);
    }
}
