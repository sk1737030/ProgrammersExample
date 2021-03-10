package codility.maxcounter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 맥스카운터() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{2}, solution.solution(1, new int[]{1, 1}));
        assertArrayEquals(new int[]{2, 3}, solution.solution(2, new int[]{1, 2, 1, 3, 2}));
    }

}