package leetcode.longestsubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test() {

        Solution solution = new Solution();
        int result1 = solution.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, result1);
        int result2 = solution.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, result2);
        int result3 = solution.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, result3);
        int result4 = solution.lengthOfLongestSubstring(" ");
        assertEquals(1, result4);
        int result5 = solution.lengthOfLongestSubstring("au");
        assertEquals(2, result5);


    }
}