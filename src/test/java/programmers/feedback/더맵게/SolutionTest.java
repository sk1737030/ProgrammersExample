package programmers.feedback.더맵게;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 더맵게() {
        Solution solution = new Solution();
        //assertEquals(2, solution.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
        //assertEquals(0, solution.solution(new int[]{7, 1, 2}, 1));
        assertEquals(2, solution.solution(new int[]{0, 1, 2}, 3));
        assertEquals(4, solution.solution(new int[]{10, 10, 10, 10, 10}, 100));
        assertEquals(-1, solution.solution(new int[]{0, 0, 3, 9, 10, 12}, 7000));
        assertEquals(-1, solution.solution(new int[]{0, 0}, 1));
        assertEquals(2, solution.solution(new int[]{1, 1, 1}, 4));
        assertEquals(2, solution.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
        assertEquals(2, solution.solution(new int[]{1, 1, 2}, 3));
        assertEquals(2, solution.solution(new int[]{1, 2, 3}, 11));
        assertEquals(3, solution.solution(new int[]{0, 0, 3, 9, 10, 12}, 7));
        assertEquals(1, solution.solution(new int[]{99999, 1}, 99999));
        assertEquals(2, solution.solution(new int[]{1, 500000, 500000}, 1000001));
    }


}