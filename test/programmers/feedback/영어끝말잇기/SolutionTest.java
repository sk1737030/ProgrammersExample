package programmers.feedback.영어끝말잇기;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        assertEquals(new int[]{3, 3},
                solution.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));
    }
}