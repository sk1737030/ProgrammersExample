package programmers.feedback.큰_수_만들기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 큰수만들기() {
        Solution solution = new Solution();
        /*assertEquals("94", solution.solution("1924", 2));
        assertEquals("3234", solution.solution("1231234", 3));*/
        assertEquals("775841", solution.solution("4177252841", 4));
        /*assertEquals("7", solution.solution("77", 1));*/
    }
}