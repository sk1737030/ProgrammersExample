package programmers.feedback.문자열내마음대로정렬하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        /*
        assertArrayEquals(new String[]{"car", "bed", "sun"}, solution.solution(new String[]{"sun", "bed", "car"}, 1));
        assertArrayEquals(new String[]{"car", "bed", "sun"}, solution.solution2(new String[]{"sun", "bed", "car"}, 1));
        assertArrayEquals(new String[]{"abcd", "abce", "cdx"}, solution.solution(new String[]{"abce", "abcd", "cdx"}, 2));
        assertArrayEquals(new String[]{"abcd", "abce", "cdx"}, solution.solution2(new String[]{"abce", "abcd", "cdx"}, 2));
        assertArrayEquals(new String[]{"abcf", "abg", "dezg"}, solution.solution(new String[]{"dezg", "abg", "abcf"}, 2));
        assertArrayEquals(new String[]{"aac", "abc", "abd", "abff"}, solution.solution(new String[]{"aac", "abd", "abc", "abff"}, 1));
        assertArrayEquals(new String[]{"aac", "abc", "abd", "abff"}, solution.solution2(new String[]{"aac", "abd", "abc", "abff"}, 1));
        */
        //assertArrayEquals(new String[]{"abc", "abcd", "adcf", "abd"}, solution.solution(new String[]{"adcf", "abd", "abc", "abcd"}, 2));
        assertArrayEquals(new String[]{"abc", "abcd", "adcf", "abd"}, solution.solution2(new String[]{"adcf", "abd", "abc", "abcd"}, 2));

    }
}