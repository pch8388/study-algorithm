package me.leetcode;

public class RomanToInteger {
    public int romanToInt(String s) {
        int len = s.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    sum += 1;
                    break;
                case 'V':
                    sum += 5;
                    if (i > 0 && s.charAt(i - 1) == 'I') {
                        sum -= 2;
                    }
                    break;
                case 'X':
                    sum += 10;
                    if (i > 0 && s.charAt(i - 1) == 'I') {
                        sum -= 2;
                    }
                    break;
                case 'L':
                    sum += 50;
                    if (i > 0 && s.charAt(i - 1) == 'X') {
                        sum -= 20;
                    }
                    break;
                case 'C':
                    sum += 100;
                    if (i > 0 && s.charAt(i - 1) == 'X') {
                        sum -= 20;
                    }
                    break;
                case 'D':
                    sum += 500;
                    if (i > 0 && s.charAt(i - 1) == 'C') {
                        sum -= 200;
                    }
                    break;
                case 'M':
                    sum += 1000;
                    if (i > 0 && s.charAt(i - 1) == 'C') {
                        sum -= 200;
                    }
            }

        }
        return sum;
    }
}
