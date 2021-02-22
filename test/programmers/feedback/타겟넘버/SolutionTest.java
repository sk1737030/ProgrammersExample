package programmers.feedback.타겟넘버;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 타켓넘버() {
        Solution solution = new Solution();
        //assertEquals(5, new Solution().solution(new int[]{1, 2, 3, 4}, 3));
        assertEquals(5, new Solution().solution(new int[]{1, 1, 1, 1, 1}, 3));
        //assertEquals(1, new Solution().solution(new int[]{1, 2}, 3));
        //assertEquals(1, new Solution().solution(new int[]{1, 2, 3, 4}, 6));
        //assertEquals(2, new Solution().solution(new int[]{1, 2, 2, 3, 1}, 5));
        //assertEquals(1, new Solution().solution(new int[]{1, 2}, 3));
    }

}