package leetcode.dp.generate_parentheses;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        assertEquals(List.of("((()))", "(()())", "(())()", "()(())", "()()()"), s.generateParenthesis(3));
    }

}