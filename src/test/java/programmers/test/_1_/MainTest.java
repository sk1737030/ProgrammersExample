package programmers.test._1_;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main solution = new Main();

        assertEquals("-1", solution.solution("100", "2345"));
        assertEquals("10", solution.solution("100", "123450"));
        assertEquals("0", solution.solution("100", "203045"));
        assertEquals("321", solution.solution("12321", "42531"));
        assertEquals("552", solution.solution("5525", "1255"));
    }

}