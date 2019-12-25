package me.study.lecture.recursion;

public class SequentialSearch {
    private static int search(int[] data, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int recursionSearch(int[] data, int begin, int end, int target) {
        if (begin > end) return -1;
        else if (target == data[begin]) return begin;
        else return recursionSearch(data, begin+1, end, target);
    }

    private static int recursionSearch2(int[] data, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        }
        int middle = (begin + end) / 2;

        if (data[middle] == target) return middle;

        int index = recursionSearch2(data, begin, middle-1, target);
        if (index != -1) return index;

        return recursionSearch2(data, middle + 1, end, target);
    }

    private static int findMax(int[] data, int begin, int end) {
        if (begin == end) return data[end];
        return Math.max(data[end], findMax(data, begin, end - 1));
    }

    private static int findMax2(int[] data, int begin, int end) {
        if (begin == end) return data[begin];
        int middle = (begin + end) / 2;
        int left = findMax2(data, begin, middle);
        int right = findMax2(data, middle + 1, end);
        return Math.max(left, right);
    }

    private static int binarySearch(String[] items, String target, int begin, int end) {
        if (begin > end) return -1;

        int middle = (begin + end) / 2;
        int compResult = target.compareTo(items[middle]);

        if (compResult == 0) return middle;
        else if (compResult < 0) return binarySearch(items, target, begin, middle - 1);
        else return binarySearch(items, target, middle + 1, end);
    }

    public static void main(String[] args) {
        int[] data = {2, 4, 7, 6, 3};
        System.out.println(search(data, 5, 3));
        System.out.println(recursionSearch(data, 0, 4, 3));
        System.out.println(recursionSearch2(data, 0, 4, 3));
        System.out.println(findMax(data, 0, 4));
        System.out.println(findMax2(data, 0, 4));

        String[] strData = {"a", "b", "c", "d", "e", "f", "g", "h"};
        System.out.println(binarySearch(strData, "c", 0, 7));
    }
}
