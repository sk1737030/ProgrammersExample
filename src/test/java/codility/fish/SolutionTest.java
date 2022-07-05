package codility.fish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(2, solution.solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}));
        assertEquals(4, solution.solution(new int[]{4, 3, 7, 1, 5}, new int[]{0, 1, 0, 0, 0}));
        assertEquals(4, solution.solution(new int[]{4, 3, 7, 1, 5}, new int[]{1, 0, 1, 1, 1}));
        assertEquals(4, solution.solution(new int[]{4, 8, 7, 1, 5}, new int[]{1, 0, 1, 1, 1}));
        assertEquals(1, solution.solution(new int[]{4, 8}, new int[]{1, 0}));
        assertEquals(2, solution.solution(new int[]{4, 8}, new int[]{1, 1}));
        assertEquals(2, solution.solution(new int[]{4, 8}, new int[]{0, 1}));
        assertEquals(2, solution.solution(new int[]{4, 8}, new int[]{0, 0}));
        assertEquals(2, solution.solution(new int[]{8, 4}, new int[]{0, 0}));
        assertEquals(2, solution.solution(new int[]{8, 4}, new int[]{0, 1}));
        assertEquals(2, solution.solution(new int[]{1, 2}, new int[]{1, 1}));
        assertEquals(1, solution.solution(new int[]{2, 1}, new int[]{1, 0}));
    }

}