package programmers.feedback.네트워크;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 네트워크() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(6, new int[][]{
                {1, 0, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 1},
                {1, 0, 1, 1, 1, 1},
                {1, 0, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1}
        }));
        assertEquals(2, solution.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
        assertEquals(1, solution.solution(3, new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}));
        assertEquals(2, solution.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
        assertEquals(2, solution.solution(3, new int[][]{{1, 1, 1}, {1, 1, 0}, {0, 0, 1}}));
        assertEquals(1, solution.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
        assertEquals(1, solution.solution(2, new int[][]{{1, 1}, {1, 1}}));
        assertEquals(2, solution.solution(2, new int[][]{{1, 0}, {0, 1}}));
        assertEquals(3, solution.solution(3, new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        assertEquals(3, solution.solution(3, new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        assertEquals(2, solution.solution(3, new int[][]{{1, 0, 1}, {0, 1, 0}, {1, 0, 1}}));
        assertEquals(2, solution.solution(3, new int[][]{{1, 0, 1}, {0, 1, 1}, {1, 0, 1}}));
        assertEquals(2, solution.solution(3, new int[][]{{1, 0, 0}, {0, 1, 1}, {0, 1, 1}}));
        assertEquals(4, solution.solution(4, new int[][]{{1, 0, 0, 0}, {0, 1, 0, 1}, {0, 0, 1, 1}}));
        assertEquals(4, solution.solution(4, new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}}));
        assertEquals(4, solution.solution(4, new int[][]{{1, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 1, 1}, {1, 0, 0, 1}}));
        assertEquals(1, solution.solution(4, new int[][]{{1, 1, 0, 0}, {1, 1, 0, 1}, {0, 0, 1, 1}, {0, 1, 1, 1}}));
    }
}