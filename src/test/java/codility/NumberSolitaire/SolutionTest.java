package codility.NumberSolitaire;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
      //  assertEquals(8, solution.solution(new int[]{1, -2, 0, 9, -1, -2}));
        assertEquals(-1, solution.solution(new int[]{0, -2, -1, -3, -4, -5, -6, 0}));
    }
}