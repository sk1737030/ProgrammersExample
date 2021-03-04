package programmers.feedback.삼각달팽이;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 삼각달팽이() {
        Solution solution = new Solution();
        //assertEquals(new int[]{1, 2, 9, 3, 10, 8, 4, 5, 6, 7}, solution.solution(4));
        assertEquals(new int[]{1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9}, solution.solution(5));
        assertEquals(new int[]{1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11}, solution.solution(6));
    }

}