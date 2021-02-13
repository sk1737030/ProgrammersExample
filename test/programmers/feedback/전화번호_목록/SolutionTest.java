package programmers.feedback.전화번호_목록;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        /*assertFalse(solution.solution(new String[]{"119", "97674223", "1195524421"}));
        assertTrue(solution.solution(new String[]{"123", "456", "789"}));
        assertFalse(solution.solution(new String[]{"12", "123", "1235", "567", "88"}));*/
        assertFalse(solution.solution(new String[]{"12", "1", "89", "567", "88"}));
    }

}