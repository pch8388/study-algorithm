package me.boj.graph.ps_10451;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PermutationCycle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N + 1];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int group = 1;
			int[] gArr = new int[N + 1];
			cnt = 0;
			for (int i = 1; i <= N; i++) {
				if (gArr[i] != 0) continue;
				dfs(i, arr, group, gArr);
			}

			System.out.println(cnt);
		}
	}

	static int cnt;
	static void dfs(int k, int[] arr, int group, int[] gArr) {
		if (gArr[k] != 0 && gArr[k] == group) {
			cnt++;
			return;
		}

		gArr[k] = group;
		dfs(arr[k], arr, group, gArr);
	}
}
