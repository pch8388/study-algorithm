package me.boj.divide.ps_1992;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadTree {
	static int[][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		map = new int[n][n];

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}

		compression(0, 0, n);

		System.out.println(sb);
	}

	static StringBuilder sb = new StringBuilder();
	private static void compression(int x, int y, int n) {
		if (n == 1) {
			sb.append(map[x][y]);
			return;
		}

		boolean zero = true;
		boolean one = true;
		for (int i = x; i < x + n; i++) {
			for (int j = y; j < y + n; j++) {
				if (map[i][j] == 1) {
					zero = false;
				} else {
					one = false;
				}
			}
		}

		if (zero) {
			sb.append(0);
		} else if (one) {
			sb.append(1);
		} else {
			sb.append("(");
			final int m = n / 2;
			compression(x, y, m);
			compression(x, y + m, m);
			compression(x + m, y, m);
			compression(x + m, y + m, m);
			sb.append(")");
		}
	}
}
