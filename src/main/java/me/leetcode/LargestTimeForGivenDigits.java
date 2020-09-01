package me.leetcode;

import java.util.Arrays;

public class LargestTimeForGivenDigits {
    public String largestTimeFromDigits(int[] A) {

        Arrays.sort(A);
        String answer = "";
        do {
            answer = maxTime(answer, timeFormat(A));
        } while (nextPermutation(4, A));

        return answer;
    }

    String maxTime(String source, String target) {
        String[] s = source.split(":");
        String[] t = target.split(":");

        if (s.length == 1) return target;
        if (t.length == 1) return source;

        if (s[0].compareTo(t[0]) > 0) {
            return source;
        } else if (s[0].compareTo(t[0]) < 0) {
            return target;
        } else {
            if (s[1].compareTo(t[1]) > 0) {
                return source;
            } else if (s[1].compareTo(t[1]) < 0) {
                return target;
            }
        }

        return source;
    }

    String timeFormat(int[] arr) {
        int hour = arr[0] * 10 + arr[1];
        int minute = arr[2] * 10 + arr[3];

        return hour < 24 && minute < 60 ?
            (hour < 10 ? "0" + hour : hour) + ":" + (minute < 10 ? "0" + minute : minute) : "";
    }

    boolean nextPermutation(int n, int[] arr) {
        int i = n - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) i--;
        if (i <= 0) return false;

        int j = n - 1;
        while (j > 0 && arr[i - 1] >= arr[j]) j--;

        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        j = n - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return true;
    }
}