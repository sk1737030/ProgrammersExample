package inflearn.strings.유요한_팰린드롬;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals("YES", T.solution("found7, time: study; Yduts; emit, 7Dnuof "));
    }

}