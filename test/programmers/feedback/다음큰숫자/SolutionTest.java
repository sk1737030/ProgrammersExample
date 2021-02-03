package programmers.feedback.다음큰숫자;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void 다음큰숫자() {
        Solution solution = new Solution();
        assertEquals(12, solution.solution(10));
    }
}