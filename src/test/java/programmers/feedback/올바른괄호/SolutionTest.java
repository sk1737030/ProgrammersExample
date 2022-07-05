package programmers.feedback.올바른괄호;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        assertTrue(solution.solution("()()"));
        assertTrue(solution.solution("(())()"));
        assertFalse(solution.solution(")()("));
        assertFalse(solution.solution("(()("));
    }
}