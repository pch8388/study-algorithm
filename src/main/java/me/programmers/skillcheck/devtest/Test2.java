package me.programmers.skillcheck.devtest;

class Test2 {
    public static int minOfSwap = -1;

    public int solution(int[] numbers, int K) {
        getMinOfSwap(numbers, 0, numbers.length, K, 0);
        return minOfSwap;
    }

    public void getMinOfSwap(int[] numbers, int depth, int n, int K, int countOfSwap) {
        if (depth == n) {
            if (isConditionIn(numbers, K)) {
                if (minOfSwap == -1) minOfSwap = Integer.MAX_VALUE;
                minOfSwap = Math.min(minOfSwap, countOfSwap);
                return;
            }
        }
        for (int i = depth; i < n; ++i) {
            swap(numbers, depth, i);
            getMinOfSwap(numbers, depth + 1, n, K, countOfSwap + 1);
            swap(numbers, depth, i);
            getMinOfSwap(numbers, depth + 1, n, K, countOfSwap);
        }
    }

    public boolean isConditionIn(int[] numbers, int K) {
        for (int i = 1; i < numbers.length - 1; ++i) {
            if (Math.abs(numbers[i - 1] - numbers[i]) > K
                || Math.abs(numbers[i + 1] - numbers[i]) > K) {
                return false;
            }
        }
        return true;
    }

    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
