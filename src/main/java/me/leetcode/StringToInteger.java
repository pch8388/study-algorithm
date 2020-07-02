package me.leetcode;

import java.math.BigInteger;
import java.util.LinkedList;

public class StringToInteger {
    public int myAtoi(String str) {
        int len = str.length();
        boolean isFirst = false;
        boolean isNegative = false;
        boolean firstOper = false;
        boolean check = false;
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            // 공백이 아닌걸 만나면
            if (str.charAt(i) != ' ') {
                isFirst = true;
            }

            // 숫자를 만나면
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                integers.add((int) str.charAt(i) - '0');
                check = true;
            } else if (str.charAt(i) == '-') {
                if (firstOper || check) return answer(integers, isNegative);
                isNegative = true;
                firstOper = true;
            } else if (str.charAt(i) == '+') {
                if (firstOper || check) return answer(integers, isNegative);
                firstOper = true;
            } else if (isFirst) { // 공백이 아닌 것과 만났고, 숫자가 아니면 반환
                return answer(integers, isNegative);
            }
        }

        return answer(integers, isNegative);
    }

    private int answer(LinkedList<Integer> integers, boolean isNegative) {
        if (integers.isEmpty()) return 0;

        BigInteger sum = BigInteger.ZERO;
        for (Integer x : integers) {
            sum = sum.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(x));
        }
        if (isNegative) sum = sum.multiply(BigInteger.valueOf(-1));
        if (sum.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) return Integer.MAX_VALUE;
        if (sum.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) return Integer.MIN_VALUE;

        return sum.intValue();
    }
}