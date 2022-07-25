package inflearn.greedy.결혼식;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 30분 초과
 */
class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(2, T.solution(5, new int[][]{
            {14, 18},
            {12, 15},
            {15, 20},
            {20, 30},
            {5, 14},
        }));

        assertEquals(9, T.solution(10, new int[][]{
            {17, 28},
            {6, 30},
            {1, 27},
            {19, 38},
            {4, 46},
            {23, 30},
            {35, 43},
            {26, 45},
            {21, 31},
            {11, 44}
        }));
    }

}