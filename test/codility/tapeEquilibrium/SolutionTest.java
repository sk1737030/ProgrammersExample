package codility.tapeEquilibrium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void TapeEquilibrium테스트() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(new int[]{3, 1, 2, 4, 3}));
        assertEquals(2000, solution.solution(new int[]{-1000,1000}));
    }
}