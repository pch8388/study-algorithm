package me.programmers.etc.ps_12909;

public class Bracket {
    boolean solution(String s) {
        char[] chars = s.toCharArray();

        int openCount = 0;
        for (char c : chars) {
            if (c == '(') {
                openCount++;
            } else {
                openCount--;
            }
            if (openCount < 0) {
                return false;
            }
        }
        return openCount == 0;
    }
}
