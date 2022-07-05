package programmers.step2example.이진변환반복하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void 이진변환테스트() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{3, 8}, solution.solution("110010101001"));
        assertArrayEquals(new int[]{3, 3}, solution.solution("01110"));
        assertArrayEquals(new int[]{4, 1}, solution.solution("1111111"));
        assertArrayEquals(new int[]{0, 0}, solution.solution("11"));
    }

}