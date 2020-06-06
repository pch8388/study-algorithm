package me.codility.lesson3;

public class Frog {
	public int solution(int X, int Y, int D) {
		int k = Y - X;
		int n = k / D;
		int m = k % D;

		return m > 0 ? n + 1 : n;
	}
}
