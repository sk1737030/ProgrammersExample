package programmers.feedback.도둑질;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 도둑질() {
        Solution solution = new Solution();
        assertEquals(4, solution.solution(new int[]{1, 2, 3, 1}));
        assertEquals(20, solution.solution(new int[]{2, 1, 1, 9, 2, 1, 1, 9}));
        assertEquals(21, solution.solution(new int[]{1, 2, 1, 9, 2, 1, 1, 9}));
        assertEquals(21, solution.solution(new int[]{1, 2, 1, 9, 9, 1, 1, 9}));
        assertEquals(11, solution.solution(new int[]{2, 1, 1, 9, 1}));
        assertEquals(11, solution.solution(new int[]{2, 1, 9, 9, 1}));
        assertEquals(12, solution.solution(new int[]{2, 3, 9, 9, 1}));
        assertEquals(18, solution.solution(new int[]{2, 3, 9, 1, 9}));
    }

}