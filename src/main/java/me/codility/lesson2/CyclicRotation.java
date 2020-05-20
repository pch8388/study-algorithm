package me.codility.lesson2;

public class CyclicRotation {
	public int[] solution(int[] A, int K) {
		int len = A.length;
		if (len == 0) {
			return A;
		}
		if (K == len) {
			return A;
		}

		while (K-- > 0) {
			int temp = A[len - 1];
			int t = A[0];
			A[0] = temp;
			for (int i = 1; i < len; i++) {
				temp = A[i];
				A[i] = t;
				t = temp;
			}
		}
		return A;
	}
}
