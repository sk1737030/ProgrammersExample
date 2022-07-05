package inflearn.stack_queue.후위식_연산;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main main = new Main();
        int answer = main.solution("352+*9-");
        assertEquals(12, answer);
    }
}