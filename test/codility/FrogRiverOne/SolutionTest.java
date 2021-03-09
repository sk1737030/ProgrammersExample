package codility.FrogRiverOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 개구리_점프() {
        Solution solution = new Solution();
        assertEquals(4, solution.solution(3, new int[]{1, 3, 1, 3, 2, 1, 3}));
    }
}