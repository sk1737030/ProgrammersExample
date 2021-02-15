package programmers.feedback.더맵게;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 더맵게() {
        Solution solution = new Solution();
        assertEquals(5, solution.solution(new int[]{3, 9, 1, 2, 10, 12}, 7));
    }


}