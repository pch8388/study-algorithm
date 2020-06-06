package me.codility.lesson3;

import java.util.Arrays;

public class PermMissingElem {
	public int solution(int[] A) {
		Arrays.sort(A);
		int index = 1;
		for (int i : A) {
			if (index != i) return index;
			index++;
		}
		return index;
	}
}
