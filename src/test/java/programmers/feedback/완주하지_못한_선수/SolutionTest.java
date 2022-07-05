package programmers.feedback.완주하지_못한_선수;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    public void test() {

        Solution solution = new Solution();
        assertEquals("leo", solution.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        assertEquals("vinko", solution.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
        assertEquals("mislav", solution.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));

    }


}