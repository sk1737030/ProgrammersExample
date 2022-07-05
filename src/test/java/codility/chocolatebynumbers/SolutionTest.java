package codility.chocolatebynumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 초콜릿넘버문제() {
        Solution solution = new Solution();
        assertEquals(5, solution.solution(10, 6));
    }

}