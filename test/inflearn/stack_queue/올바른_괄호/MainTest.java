package inflearn.stack_queue.올바른_괄호;

import inflearn.strings.문장_속_단어.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main main = new Main();
        String answer = main.solution("(()(()))(()");

        assertEquals("NO", answer);
    }

}