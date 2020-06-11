package me.codility.lesson4;

public class FrogRiverOne {
	public int solution(int X, int[] A) {
		int min = 0;
		boolean[] visited = new boolean[A.length];

		if (X > A.length) {
			return -1;
		}

		for (int i = 0; i < A.length; i++) {
			visited[A[i] - 1] = true;

			boolean c = true;
			for (int j = min; j < X; j++) {
				if (!visited[j]) {
					c = false;
					break;
				}
				min = j + 1;
			}
			if (c) return i;
		}
		return -1;
	}
}
