package programmers.feedback.신규_아이디_추천;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 신규_아이디_추천() {
        Solution solution = new Solution();
        assertEquals("bat.y.abcdefghi", solution.solution("...!@BaT#*..y.abcdefghijklm"));
        assertEquals("z--", solution.solution("z-+.^."));
        assertEquals("aaa", solution.solution("=.="));
        assertEquals("abcdefghijklmn", solution.solution("abcdefghijklmn.p"));
    }

}