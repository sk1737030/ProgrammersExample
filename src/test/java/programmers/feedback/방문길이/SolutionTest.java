package programmers.feedback.방문길이;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution("UDU"));
        //assertEquals(4, solution.solution("ULUL"));
        //assertEquals(7, solution.solution("LULLLLLLU"));


    }

}