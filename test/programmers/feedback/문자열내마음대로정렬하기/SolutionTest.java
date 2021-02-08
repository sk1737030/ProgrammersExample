package programmers.feedback.문자열내마음대로정렬하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertArrayEquals(new String[]{"car", "bed", "sun"}, solution.solution(new String[]{"sun", "bed", "car"}, 1));
        assertArrayEquals(new String[]{"abcd", "abce", "cdx"}, solution.solution(new String[]{"abce", "abcd", "cdx"}, 2));
    }
}