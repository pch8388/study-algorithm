package me.study.lecture.recursion;

public class Euclid {
    private static int euclid(int p, int q) {
        if (q == 0) {
            return p;
        }
        return euclid(q, p%q);
    }

    public static void main(String[] args) {
        System.out.println(euclid(9,3));
    }
}
