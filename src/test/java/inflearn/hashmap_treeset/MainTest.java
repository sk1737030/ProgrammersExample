package inflearn.hashmap_treeset;

import inflearn.hashmap_treeset.학급회장.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {

        Main T = new Main();
        assertEquals("C", T.solution("BACBACCACCBDEDE"));
    }

}