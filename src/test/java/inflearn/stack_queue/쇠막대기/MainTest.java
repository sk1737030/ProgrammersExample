package inflearn.stack_queue.쇠막대기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main t = new Main();
        assertEquals(17, t.solution("()(((()())(())()))(())"));
        assertEquals(24, t.solution("(((()(()()))(())()))(()())"));
    }

}