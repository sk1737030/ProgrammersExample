package backjoon.차이를_최대로;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 차이를_최대로() {
        Main solution = new Main();
        assertEquals(62, solution.solution(new int[]{20, 1, 15, 8, 4, 10}));
    }
}