package me.study.a_4673;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            boolean b = true;
            for (int j = 1; j < i; j++) {
                int r = j + recursion(j);
                if(i == r) {
                    b = false;
                    break;
                }
            }
            if(b) {
                System.out.println(i);
            }
        }
    }

    private static int recursion(int n) {
        if(n/10 == 0) return n % 10;
        return n % 10 + recursion(n/10);
    }

}