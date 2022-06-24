package inflearn.strings;

import inflearn.strings.문자찾기.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main main = new Main();
        int answer = main.solution("Computercooler", 'c');
        assertEquals(2, answer);
    }


}