package programmers.feedback.타일링;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 타일링() {
        Solution solution = new Solution();
        assertEquals(5, solution.solution(45));
    }

}