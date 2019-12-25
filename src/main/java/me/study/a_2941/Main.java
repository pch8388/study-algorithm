package me.study.a_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = bf.readLine().toCharArray();
        int i = 0;
        int cnt = 0;
        while (i < chars.length) {
            switch (chars[i]) {
                case 'c' :
                    if(i == chars.length-1) break;
                    if (chars[i + 1] == '=' || chars[i + 1] == '-') {
                        i++;
                    }
                    break;
                case 'd' :
                    if(i == chars.length-1) break;
                    if (chars[i + 1] == 'z' && (i < chars.length - 2 && chars[i + 2] == '=')) {
                        i = i + 2;
                    }
                    if (chars[i + 1] == '-') {
                        i++;
                    }
                    break;
                case 'l': case 'n':
                    if(i == chars.length-1) break;
                    if (chars[i + 1] == 'j') {
                        i++;
                    }
                    break;
                case 's' : case 'z' :
                    if(i == chars.length-1) break;
                    if (chars[i + 1] == '=') {
                        i++;
                    }
                    break;
            }
            i++;
            cnt++;
        }
        bf.close();
        System.out.println(cnt);
    }
}
