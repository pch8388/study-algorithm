package me.leetcode;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        String s = "";
        int index = -1;
        if (haystack.length() < needle.length()) return index;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                index = indexOf(haystack, needle, i);
            }

            if (index >= 0) {
                return index;
            }
        }
        return index;
    }

    int indexOf(String haystack, String needle, int idx) {
        int ni = 0;
        if (haystack.length() - idx < needle.length()) return -1;

        for (int i = 0; i < needle.length(); i++) {
            if (haystack.charAt(i + idx) != needle.charAt(ni++)) {
                return -1;
            }
        }

        return idx;
    }
}
