package me.leetcode;

import java.util.StringTokenizer;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String str = "";
        while (st.hasMoreTokens()) {
            str = st.nextToken();
        }
        return str.length();
    }
}
