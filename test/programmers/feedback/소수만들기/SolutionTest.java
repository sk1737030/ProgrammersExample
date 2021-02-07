package programmers.feedback.소수만들기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution = new Solution();
        //assertEquals(1, solution.solution(new int[]{1, 2, 3, 4}));
        assertEquals(1, solution.solution(new int[]{1, 2, 3, 4}));
        //assertEquals(4, solution.solution(new int[]{1, 2, 7, 6, 4}));
    }

}