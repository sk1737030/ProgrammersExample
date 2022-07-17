package programmers.test.groo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(9, T.solution("abcebecahigb"));
//        assertEquals(-1, T.solution("abcde"));
//        assertEquals(2, T.solution("abca"));
    }

}