package backjoon.미로탐색;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void 미로탐색() {
        Main main = new Main();
        assertEquals(15, main.solution(4, 6, new int[][]{
                {1, 0, 1, 1, 1, 1},
                {1, 0, 1, 0, 1, 0},
                {1, 0, 1, 0, 1, 1},
                {1, 1, 1, 0, 1, 1}
        }));
    }

}