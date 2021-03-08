package codility.frog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void 프로그() {
        Solution solution = new Solution();
        assertEquals(3, solution.solution(10, 85, 30));
        assertEquals(1, solution.solution(10, 85, 900));
    }
}