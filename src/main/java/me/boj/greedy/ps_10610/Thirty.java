package me.boj.greedy.ps_10610;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Thirty {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String s = sc.nextLine();

		ArrayList<Integer> list = new ArrayList<>();
		final int len = s.length();
		for (int i = 0; i < len; i++) {
			list.add(s.charAt(i) - '0');
		}

		list.sort(Comparator.reverseOrder());

		final Integer k = list.get(len - 1);
		final Integer sum = list.stream().reduce(0, Integer::sum);
		if (k == 0 && sum % 3 == 0) {
			StringBuilder sb = new StringBuilder();
			for (Integer integer : list) {
				sb.append(integer);
			}
			System.out.println(sb);
		} else {
			System.out.println(-1);
		}
	}
}
