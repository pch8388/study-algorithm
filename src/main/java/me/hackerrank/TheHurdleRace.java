package me.hackerrank;

public class TheHurdleRace {
    static int hurdleRace(int k, int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] - k > max) {
                max = height[i] - k;
            }
        }
        return max;
    }
}
