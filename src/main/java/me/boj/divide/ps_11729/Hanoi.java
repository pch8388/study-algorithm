package me.boj.divide.ps_11729;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Hanoi {
	static int[][] result;
	static int index;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		result = new int[(int) (Math.pow(2, n) - 1)][2];
		hanoi(n, 1, 2, 3);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(index));
		bw.newLine();
		for (int[] ints : result) {
			bw.write(ints[0] + " " + ints[1]);
			bw.newLine();
		}
		bw.close();
	}

	static void hanoi(int n, int from, int by, int to) {
		if (n == 1) {
			move(from, to);
			return;
		}

		hanoi(n - 1, from, to, by);
		move(from, to);
		hanoi(n - 1, by, from, to);
	}

	private static void move(int from, int to) {
		result[index++] = new int[]{from, to};
	}
}
