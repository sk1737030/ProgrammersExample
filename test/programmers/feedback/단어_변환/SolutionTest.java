package programmers.feedback.단어_변환;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 단어변환() {
        Solution solution = new Solution();
        assertEquals(4, solution.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}));
        assertEquals(0, solution.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"}));
        assertEquals(1, solution.solution("aax", "aac", new String[]{"aaa", "aab", "aac", "lot", "log"}));
    }

}