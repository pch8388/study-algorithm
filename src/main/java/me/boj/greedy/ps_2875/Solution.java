package me.boj.greedy.ps_2875;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int n = N / 2;

		int min = Math.min(n, M);
		int mod_n = N - (2 * min);
		int mod_m = M - min;

		K = K - (mod_n + mod_m);
		while (K > 0) {
			min--;
			K -= 3;
		}

		System.out.println(min);
	}
}
