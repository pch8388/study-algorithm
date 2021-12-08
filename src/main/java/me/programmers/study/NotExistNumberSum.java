package me.programmers.study;

import java.util.Arrays;

public class NotExistNumberSum {
    public static int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }
}
