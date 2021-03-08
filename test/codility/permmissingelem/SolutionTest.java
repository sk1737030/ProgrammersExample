package codility.permmissingelem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 미싱엘렘() {
        Solution solution = new Solution();
        assertEquals(4, solution.solution(new int[]{2, 3, 1, 5}));
        assertEquals(1, solution.solution(new int[]{}));
        assertEquals(3, solution.solution(new int[]{1, 2}));
        ;
    }

}