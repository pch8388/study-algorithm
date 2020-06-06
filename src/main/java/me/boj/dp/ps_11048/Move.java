package me.boj.dp.ps_11048;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Move {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] map = new int[N + 1][M + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= M; j++) {
				int temp = Integer.parseInt(st.nextToken());
				int prev = Math.max(Math.max(map[i - 1][j - 1], map[i - 1][j]), map[i][j - 1]);
				map[i][j] = temp + prev;
			}
		}

		System.out.println(map[N][M]);
	}
}