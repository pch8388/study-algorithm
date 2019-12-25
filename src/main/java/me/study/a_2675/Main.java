package me.study.a_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n; i++) {
			String s = bf.readLine();
			String[] arr = s.split(" ");
			for (int x = 0; x < arr[1].length(); x++) {
				for(int j = 0; j < Integer.parseInt(arr[0]); j++) {
					System.out.print(arr[1].charAt(x));
				}
			}
			System.out.println();
		}
		bf.close();
	}
}
