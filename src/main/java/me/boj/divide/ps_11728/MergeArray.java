package me.boj.divide.ps_11728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MergeArray {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] A = new int[N];
		int[] B = new int[M];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}

		int[] merge = new int[N + M];
		int indexA = 0;
		int indexB = 0;
		for (int i = 0; i < N + M; i++) {
			if (indexA >= N) {
				merge[i] = B[indexB++];
			} else if (indexB >= M) {
				merge[i] = A[indexA++];
			} else if (A[indexA] < B[indexB]) {
				merge[i] = A[indexA++];
			} else {
				merge[i] = B[indexB++];
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < merge.length; i++) {
			sb.append(merge[i]).append(" ");
		}

		System.out.println(sb);
	}
}
