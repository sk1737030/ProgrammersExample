package inflearn.sort.마구간_정하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(3, T.solution(5, 3, new int[]{1, 2, 8, 4, 9}));
        assertEquals(1, T.solution(1, 3, new int[]{1, 8, 9}));
    }

}