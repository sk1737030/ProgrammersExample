package inflearn.array.등수구하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertArrayEquals(new int[]{4, 3, 2, 1, 5}, T.solution(new int[]{87, 89, 92, 100, 76}));
    }

}