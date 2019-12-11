package me.study.algo_1966;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrinterQueueTests {

    @Test
    @DisplayName("검색 테스트")
    public void search() {
        int[] arr = {1, 1, 9, 1, 1, 1};
        int result = PrinterQueue.search(arr, 0);
        assertThat(result).isEqualTo(5);

        int[] arr2 = {1, 2, 3, 4};
        assertThat(PrinterQueue.search(arr2, 2)).isEqualTo(2);

        int[] arr3 = {5};
        assertThat(PrinterQueue.search(arr3, 0)).isEqualTo(1);
    }
}