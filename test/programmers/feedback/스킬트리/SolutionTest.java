package programmers.feedback.스킬트리;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        assertEquals(2, solution.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
        assertEquals(1, solution.solution("ABC", new String[]{"BACDE", "CBADF", "AEB", "BDA"}));
        assertEquals(3, solution.solution("AC", new String[]{"BACDE", "CBADF", "AEB", "BDA"}));
        assertEquals(1, solution.solution("ACD", new String[]{"ACD"}));
        assertEquals(0, solution.solution("ACD", new String[]{"CD"}));
        assertEquals(1, solution.solution("CBD", new String[]{"CBADF"}));
        assertEquals(1, solution.solution("G", new String[]{"CBADF"}));
        assertEquals(1, solution.solution("GZ", new String[]{"CBADG"}));
        assertEquals(2, solution.solution("G", new String[]{"ABC", "DEF"}));
        assertEquals(1, solution.solution("REA", new String[]{"REA", "POA"}));
        assertEquals(0, solution.solution("CBDK", new String[]{"AECD"}));
    }
}