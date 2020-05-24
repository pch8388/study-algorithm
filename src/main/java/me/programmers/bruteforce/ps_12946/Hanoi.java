package me.programmers.bruteforce.ps_12946;

public class Hanoi {
	public int[][] solution(int n) {
		idx = 0;
		answer = new int[(int) (Math.pow(2, n) - 1)][2];
		hanoi(n, 1, 2, 3);

		return answer;
	}

	static int idx;
	static int[][] answer;
	void move(int start, int to) {
		answer[idx++] = new int[]{start, to};
	}

	void hanoi(int N, int from, int by, int to) {
		if (N == 1) {
			move(from, to);
			return;
		}
		hanoi(N - 1, from, to, by);
		move(from, to);
		hanoi(N - 1, by, from, to);
	}
}
