package me.codility.lesson5;

public class CountDiv {
    public int solution(int A, int B, int K) {
        return A == 0 ? B / K + 1 : B / K - (A - 1) / K;
    }
}
