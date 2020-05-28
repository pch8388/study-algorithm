package me.programmers.greedy.ps_42884;

import java.util.Arrays;

public class Camera {
	public int solution(int[][] routes) {
		Arrays.sort(routes, (p, c) -> {
			if (p[0] > c[0]) {
				return 1;
			}
			if (p[0] == c[0]) {
				return Integer.compare(c[1], p[1]);
			}
			return -1;
		});

		int answer = 1;

		int x = routes[0][1];
		for (int[] route : routes) {
			if (x >= route[0]) {
				x = Math.min(route[1], x);
			} else {
				answer++;
				x = route[1];
			}
		}
		return answer;
	}
}