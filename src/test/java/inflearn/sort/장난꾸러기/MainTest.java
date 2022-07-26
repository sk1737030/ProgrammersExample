package inflearn.sort.장난꾸러기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertArrayEquals(new int[]{4, 7}, T.solution(9, new int[]{155, 157, 161, 167, 167, 167, 161, 170, 173}));
        // assertArrayEquals(new int[]{3, 8}, T.solution(9, new int[]{120, 125, 152, 130, 135, 135, 143, 127, 160}));
    }
}