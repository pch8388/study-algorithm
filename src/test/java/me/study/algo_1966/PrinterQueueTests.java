package me.study.algo_1966;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrinterQueueTests {
    @Test
    public void search() {
        int[] arr = {1, 1, 9, 1, 1, 1};
        int result = PrinterQueue.search(arr, 0);
        assertThat(result).isEqualTo(5);
    }
}