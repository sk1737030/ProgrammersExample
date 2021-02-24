package programmers.feedback.구명보트;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 구명보트() {
        Solution solution = new Solution();
        assertEquals(3, solution.solution(new int[]{70, 50, 80, 50}, 100));
        assertEquals(3, solution.solution(new int[]{70, 80, 50}, 100));
        assertEquals(2, solution.solution(new int[]{40, 50, 60, 50}, 100));
        assertEquals(3, solution.solution(new int[]{40, 50, 60, 50, 90}, 100));
        assertEquals(3, solution.solution(new int[]{40, 50, 60, 50, 90, 10}, 100));
    }

}