package codility.passingcar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 패싱카() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(new int[]{1, 1, 1, 0, 1}));
    }

}