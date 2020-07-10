package me.leetcode;

public class IntegerToRoman {
    public String intToRoman(int num) {
        int x = num;
        StringBuilder sb = new StringBuilder();
        if (x >= 1000) {
            int k = x / 1000;
            for (int i = 0; i < k; i++) {
                sb.append("M");
                x -= 1000;
            }
        }
        if (x >= 900) {
            sb.append("CM");
            x -= 900;
        }
        if (x >= 500) {
            sb.append("D");
            x -= 500;
        }
        if (x >= 400) {
            sb.append("CD");
            x -= 400;
        }
        if (x >= 100) {
            int k = x / 100;
            for (int i = 0; i < k; i++) {
                sb.append("C");
                x -= 100;
            }
        }
        if (x >= 90) {
            sb.append("XC");
            x -= 90;
        }
        if (x >= 50) {
            sb.append("L");
            x -= 50;
        }
        if (x >= 40) {
            sb.append("XL");
            x -= 40;
        }
        if (x >= 10) {
            int k = x / 10;
            for (int i = 0; i < k; i++) {
                sb.append("X");
                x -= 10;
            }
        }
        if (x >= 9) {
            sb.append("IX");
            x -= 9;
        }
        if (x >= 5) {
            sb.append("V");
            x -= 5;
        }
        if (x >= 4) {
            sb.append("IV");
            x -= 4;
        }
        if (x >= 1) {
            int k = x;
            for (int i = 0; i < k; i++) {
                sb.append("I");
                x -= 1;
            }
        }
        return sb.toString();
    }
}
