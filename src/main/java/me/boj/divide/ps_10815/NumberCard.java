package me.boj.divide.ps_10815;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberCard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			map.put(sc.nextInt(), true);
		}

		int M = sc.nextInt();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < M; i++) {
			if (map.containsKey(sc.nextInt())) {
				builder.append(1).append(" ");
			} else {
				builder.append(0).append(" ");
			}
		}

		System.out.println(builder);
	}
}
