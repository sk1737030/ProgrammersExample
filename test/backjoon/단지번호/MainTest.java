package backjoon.단지번호;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void 단지번호() {
        Main main = new Main();
        assertArrayEquals(new int[]{3, 7, 8, 9},
                main.solution(new int[][]{
                        {0, 1, 1, 0, 1, 0, 0},
                        {0, 1, 1, 0, 1, 0, 1},
                        {1, 1, 1, 0, 1, 0, 1},
                        {0, 0, 0, 0, 1, 1, 1},
                        {0, 1, 0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 1, 1, 0},
                        {0, 1, 1, 1, 0, 0, 0}
                }));
      /*  assertArrayEquals(new int[]{4, 1, 1, 8, 16},
                main.solution(new int[][]{
                        {0, 1, 1, 0, 1, 0, 0},
                        {0, 1, 1, 0, 1, 0, 1},
                        {1, 1, 1, 1, 1, 0, 1},
                        {0, 0, 0, 0, 1, 1, 1},
                        {0, 1, 0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 1, 1, 0},
                        {1, 0, 1, 1, 0, 0, 1}
                }));*/
    }

}