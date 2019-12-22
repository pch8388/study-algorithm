package me.study.algo_11650;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortPointTests {

    @DisplayName("리스트 일치 확인")
    @Test
    void sortPoint() {
        List<Point> points =
            Arrays.asList(Point.of(3, 4), Point.of(1, 1), Point.of(1, -1),
                            Point.of(2, 2), Point.of(3, 3));

        Collections.sort(points);
        List<Point> result =
            Arrays.asList(Point.of(1, -1), Point.of(1, 1), Point.of(2, 2),
                Point.of(3, 3), Point.of(3, 4));
        assertEquals(points, result);
    }
}