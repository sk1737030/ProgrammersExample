package codility.ct;

import codility.fish.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution7Test {
    @Test
    void test() {
        Solution7 solution = new Solution7();

        assertEquals(2, solution.solution("H"));
        //assertEquals(2, solution.solution("-H-HH--"));
        //assertEquals(3, solution.solution("-H-H-H-H-H"));
        //assertEquals(2, solution.solution("-H-H-H"));
        //assertEquals(2, solution.solution("-H-HH--"));
        //assertEquals(2, solution.solution("-H-HH-H"));
        //assertEquals(2, solution.solution("-H-HH-H"));
        //assertEquals(1, solution.solution("---H"));
        //assertEquals(-1, solution.solution("----"));
        //assertEquals(2, solution.solution("H----H"));
    }

}