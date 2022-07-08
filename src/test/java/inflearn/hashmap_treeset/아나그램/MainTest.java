package inflearn.hashmap_treeset.아나그램;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals("YES", T.solution("AbaAeCe", "baeeACA"));
        assertEquals("NO", T.solution("abaCC", "Caaab"));
    }

}