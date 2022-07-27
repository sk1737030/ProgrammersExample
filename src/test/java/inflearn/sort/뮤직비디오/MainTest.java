package inflearn.sort.뮤직비디오;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(17, T.solution(9, 3, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

}