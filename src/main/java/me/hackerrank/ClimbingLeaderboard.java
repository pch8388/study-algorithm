package me.hackerrank;

public class ClimbingLeaderboard {
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int prev = scores[0];
        int len = scores.length;
        int rank = 1;
        int[] ranks = new int[len];
        ranks[0] = rank;
        for (int i = 1; i < len; i++) {
            if (prev == scores[i]) {
                ranks[i] = rank;
            } else {
                ranks[i] = ++rank;
                prev = scores[i];
            }
        }

        int aliceLen = alice.length;
        int[] answer = new int[aliceLen];
        for (int i = 0; i < aliceLen; i++) {
            int r = binarySearch(scores, alice[i], 0, len);
            if (r == -1) {
                answer[i] = ranks[len - 1] + 1;
            } else {
                answer[i] = ranks[r];
            }
        }
        return answer;
    }

    private static int binarySearch(int[] items, int target, int begin, int end) {
        if (begin >= end) {
            if (begin == 0 && items[begin] < target) return 0;
            return -1;
        }

        int middle = (begin + end) / 2;

        if (items[middle] == target) {
            return middle;
        } else if (items[middle] < target) {
            if (middle - 1 < 0 || items[middle - 1] > target) return middle;
            return binarySearch(items, target, begin, middle - 1);
        }

        if (middle + 1 == items.length) {
            return -1;
        }
        if (items[middle + 1] <= target) return middle + 1;
        return binarySearch(items, target, middle + 1, end);
    }
}
