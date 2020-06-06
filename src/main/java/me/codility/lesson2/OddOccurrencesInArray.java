package me.codility.lesson2;

import java.util.HashMap;

public class OddOccurrencesInArray {
	public int solution(int[] A) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i])) {
				map.remove(A[i]);
			} else {
				map.put(A[i], true);
			}
		}
		int x = 0;
		for (Integer key : map.keySet()) {
			x = key;
		}
		return x;
	}
}
