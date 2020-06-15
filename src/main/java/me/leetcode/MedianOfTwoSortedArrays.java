package me.leetcode;

public class MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int x = nums1.length;
		int y = nums2.length;

		final int len = x + y;
		boolean isOdd = len % 2 != 0;
		int mid = isOdd ? len / 2 + 1 : len / 2;

		int[] merge = new int[len];
		int indexX = 0;
		int indexY = 0;

		for (int i = 0; i < len; i++) {
			if (indexX >= x) {
				merge[i] = nums2[indexY++];
			} else if (indexY >= y) {
				merge[i] = nums1[indexX++];
			} else if (nums1[indexX] < nums2[indexY]) {
				merge[i] = nums1[indexX++];
			} else {
				merge[i] = nums2[indexY++];
			}

			if (mid - 1 == i && isOdd) {
				return merge[i];
			}
			if (mid == i && !isOdd) {
				return ((double) merge[i] + merge[i - 1]) / 2;
			}
		}

		return 0.0;
	}
}
