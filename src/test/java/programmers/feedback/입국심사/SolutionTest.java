package programmers.feedback.입국심사;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 입국심사() {
        Solution solution = new Solution();
        //assertEquals(28, solution.solution(6, new int[]{7, 10}));
        assertEquals(10, solution.solution(2, new int[]{7, 10}));
    }

}