package me.study.lecture.recursion;

public class IntegerRecursion {
    private static void printInBinary(int n) {
        if (n < 2) {
            System.out.print(n);
        } else {
            printInBinary(n / 2);
            System.out.print(n % 2);
        }
    }

    private static int sum(int n, int[] data) {
        if (n <= 0) {
            return 0;
        }
        return sum(n-1, data) + data[n-1];
    }

    public static void main(String[] args) {
        printInBinary(15);

        System.out.println();

        int[] intArrays = {1, 2, 3, 4, 5};
        System.out.println(sum(5, intArrays));
    }
}
