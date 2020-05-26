package me.boj.divide.ps_1654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lan {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		long[] arr = new long[K];
		long total = 0;
		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			total += arr[i];
		}

		long s = 1;
		long e = total / N;

		while (s < e) {
			long mid = (s + e + 1) / 2;

			long sum = 0;
			for (int i = 0; i < K; i++) {
				sum += arr[i] / mid;
			}

			if(sum >= N) s = mid;
			else e = mid - 1;
		}
		System.out.println(s);
	}
}
