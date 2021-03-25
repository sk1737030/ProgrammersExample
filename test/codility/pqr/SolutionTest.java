package codility.pqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(new int[]{10, 2, 5, 1, 9, 20}));
    }

}