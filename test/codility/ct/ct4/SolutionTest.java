package codility.ct.ct4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1, 2, 4, 2}, solution.solution(new int[]{3, 2, 1, 2}));
        assertArrayEquals(new int[]{2, 2, 1}, solution.solution(new int[]{1, 1, 3}));
    }

}