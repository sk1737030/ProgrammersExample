package programmers.step2example.hindex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void HINDEX() {
        Solution solution = new Solution();
        assertEquals(3, solution.solution(new int[]{3, 0, 6, 1, 5, 4}));
    }
}