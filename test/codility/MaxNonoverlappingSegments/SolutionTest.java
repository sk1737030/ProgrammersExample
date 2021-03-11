package codility.MaxNonoverlappingSegments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 그리디1_테스트() {
        Solution solution = new Solution();
        assertEquals(3, solution.solution(new int[]{1, 3, 7, 9, 9}, new int[]{5, 6, 8, 9, 10}));
        assertEquals(3, solution.solution(new int[]{1, 3, 7, 8, 9}, new int[]{5, 6, 8, 9, 10}));
        assertEquals(0, solution.solution(new int[]{}, new int[]{}));
        assertEquals(1, solution.solution(new int[]{1,1,1}, new int[]{1,1,2}));
    }
}