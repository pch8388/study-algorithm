package me.leetcode;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int idx = len - 1;
        while (true) {
            if (digits[idx] < 9) {
                digits[idx] = digits[idx] + 1;
                return digits;
            }

            digits[idx] = 0;
            idx--;
            if (idx == -1) {
                int[] r = new int[len + 1];
                r[0] = 1;
                System.arraycopy(digits, 0, r, 1, len);
                return r;
            }
        }
    }

}
