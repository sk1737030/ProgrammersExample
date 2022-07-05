package inflearn.two_pointers.공통원소_구하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertArrayEquals(new Long[]{2L, 3L, 5L},
            T.solution(new long[]{1, 3, 9, 5, 2}, new long[]{3, 2, 5, 7, 8}));
    }

}