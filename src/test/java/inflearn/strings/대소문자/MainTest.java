package inflearn.strings.대소문자;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main main = new Main();
        String answer = main.solution("StuDY");

        assertEquals("sTUdy", answer);

    }

}