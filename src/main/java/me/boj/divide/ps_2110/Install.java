package me.boj.divide.ps_2110;

import java.util.Arrays;
import java.util.Scanner;

public class Install {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int[] house = new int[N];

		for (int i = 0; i < N; i++) {
			house[i] = sc.nextInt();
		}
		Arrays.sort(house);

		int l = 1;
		int r = house[N - 1] - house[0];
		int d;
		int answer = 0;

		while (l <= r) {
			int mid = (l + r) / 2;
			int s = house[0];
			int cnt = 1;

			for (int i = 1; i < N; i++) {
				d = house[i] - s;
				if (mid <= d) {
					cnt++;
					s = house[i];
				}
			}

			if (cnt >= C) {
				answer = mid;
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}

		System.out.println(answer);
	}
}
