package programmers.step2example.메뉴리뉴얼;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 메뉴리뉴얼_테스트() {
        Solution solution = new Solution();
        //assertArrayEquals(new String[]{"AC", "ACDE", "BCFG", "CDE"}, solution.solution(new String[]{"ABCD", "AC", "BC", "AD"}, new int[]{2, 3, 4}));
        assertArrayEquals(new String[]{"AC", "ACDE", "BCFG", "CDE"}, solution.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4}));
        assertArrayEquals(new String[]{"ACD", "AD", "ADE", "CD", "XYZ"}, solution.solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5}));
        assertArrayEquals(new String[]{"WX", "XY"}, solution.solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2, 3, 4}));
        assertArrayEquals(new String[]{"ABC", "AC"}, solution.solution(new String[]{"AA", "AC", "ABC", "ABCD"}, new int[]{2, 3, 4}));
    }

}