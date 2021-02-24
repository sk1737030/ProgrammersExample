package programmers.feedback.타일링2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void 타일링3xn() {
        Solution solution = new Solution();
        assertEquals(11, solution.solution(4));
        assertEquals(41, solution.solution(6));
        assertEquals(153, solution.solution(8));
        //assertEquals(153, solution.solution(5000));
    }
}