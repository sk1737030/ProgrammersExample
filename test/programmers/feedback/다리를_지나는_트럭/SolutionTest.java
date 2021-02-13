package programmers.feedback.다리를_지나는_트럭;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(8, solution.solution(2, 10, new int[]{7, 4, 5, 6}));
        assertEquals(101, solution.solution(100, 100, new int[]{10}));
        assertEquals(110, solution.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }

}