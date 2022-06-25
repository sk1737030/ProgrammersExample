package inflearn.stack_queue.올바른_괄호;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main main = new Main();
        String answer = main.solution("(()(()))(()");
        assertEquals("NO", answer);
        String answer2 = main.solution("()");
        assertEquals("YES", answer2);
        String answer3 = main.solution("))");
        assertEquals("NO", answer3);
        String answer4 = main.solution("");
        assertEquals("NO", answer4);
    }

}