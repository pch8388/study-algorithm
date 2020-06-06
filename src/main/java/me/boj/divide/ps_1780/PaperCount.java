package me.boj.divide.ps_1780;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PaperCount {
	static int[][] paper;
	static int[] cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		paper = new int[N][N];
		cnt = new int[3];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken()) + 1;
			}
		}
		divide(0, 0, N);

		StringBuilder builder = new StringBuilder();
		for (int k : cnt) {
			builder.append(k).append("\n");
		}
		System.out.println(builder);
	}

	static void divide(int x, int y, int n) {
		if (isCheck(x, y, n)) {
			cnt[paper[x][y]]++;
		} else {
			int len = n / 3;

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					divide(x + len * i, y + len * j, len);
				}
			}
		}


	}

	private static boolean isCheck(int x, int y, int n) {
		int c = paper[x][y];

		for (int i = x; i < x + n; i++) {
			for (int j = y; j < y + n; j++) {
				if(c != paper[i][j]) return false;
			}
		}
		return true;
	}
}
