package inflearn.recursive.재귀함수;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals("1 2 3 ", T.solution(3));
    }

}