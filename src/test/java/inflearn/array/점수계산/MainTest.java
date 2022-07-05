package inflearn.array.점수계산;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(10, T.solution(new int[]{1, 0, 1, 1, 1, 0, 0, 1, 1, 0}));
    }

}