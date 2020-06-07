package me.codility.lesson3;

public class TapeEquilibrium {
	public int solution(int[] A) {
		final int len = A.length;
		int sumToLast = 0;
		for (int i = 0; i < len; i++) {
			sumToLast += A[i];
		}

		int sumFromFirst = 0;
		int min = Integer.MAX_VALUE;

		for (int p = 1; p < len; p++) {
			sumFromFirst += A[p - 1];
			sumToLast -= A[p - 1];

			int d = Math.abs(sumFromFirst - sumToLast);
			min = Math.min(min, d);
		}
		return min;
	}
}
