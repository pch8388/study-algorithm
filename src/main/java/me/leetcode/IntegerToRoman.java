package me.leetcode;

public class IntegerToRoman {
    public String intToRoman(int num) {
        int x = num;
        StringBuilder sb = new StringBuilder();

        String[] strings = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] ints = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; i < 13 && x >= 0; i++) {
            while (x >= ints[i]) {
                sb.append(strings[i]);
                x -= ints[i];
            }
        }
        return sb.toString();
    }
}
