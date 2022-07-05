package inflearn.strings.회문_문자열;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals("YES", T.solution("gooG"));
    }

}