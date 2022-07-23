package inflearn.dp.최대점수_구하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
//        assertEquals(41, T.solution(5, 20,
//            new int[][]{
//                {10, 5},
//                {25, 12},
//                {15, 8},
//                {6, 3},
//                {7, 4}
//            }));

        assertEquals(141, T.solution(12, 70,
            new int[][]{
                {5, 2},
                {11, 5},
                {12, 7},
                {16, 8},
                {20, 10},
                {30, 15},
                {10, 5},
                {25, 12},
                {15, 8},
                {6, 3},
                {7, 4},
                {3, 2}
            }));
        assertEquals(28, T.solution(3, 14,
            new int[][]{
                {5, 2},
                {11, 5},
                {12, 7}
            }));
    }

}