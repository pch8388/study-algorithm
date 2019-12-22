package me.study.algo_10989;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountingSortTests {

    @DisplayName("counting sort 학습테스트")
    @Test
    void countingSort() {
        int[] arr = {5, 2, 3, 1, 4, 2, 3, 5, 1, 7};
        int[] result = {1, 1, 2, 2, 3, 3, 4, 5, 5, 7};

        assertThat(isEqulas(CountingSort.sort(arr), result)).isTrue();
    }

    static boolean isEqulas(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}