package backjoon.연구실;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void 연구실() {
        Main main = new Main();
        assertEquals(27, main.solution(7, 7, new int[][]{
                {2, 0, 0, 0, 1, 1, 0},
                {0, 0, 1, 0, 1, 2, 0},
                {0, 1, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0}
        }));
        assertEquals(27, main.solution(3, 3, new int[][]{
                {2, 1, 0},
                {1, 1, 0},
                {0, 0, 0}
        }));
        assertEquals(27, main.solution(3, 4, new int[][]{
                {2, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0}
        }));
    }
}