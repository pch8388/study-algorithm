package me.study.lecture.recursion;

public class StringLength {
    private static int length(String str) {
        if ("".equals(str)) {
            return 0;
        }
        return 1 + length(str.substring(1));
    }

    private static void printChars(String str) {
        if ("".equals(str)) {
            return;
        }
        System.out.print(str.charAt(0));
        printChars(str.substring(1));
    }

    private static void printCharsReverse(String str) {
        if ("".equals(str)) {
            return;
        }
        printCharsReverse(str.substring(1));
        System.out.print(str.charAt(0));
    }

    public static void main(String[] args) {
        System.out.println(length("hello world"));
        printChars("print characters");
        System.out.println();
        printCharsReverse("print characters");
    }
}
