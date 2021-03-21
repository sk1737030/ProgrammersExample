package codility.ct2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void test() {
        Main main = new Main();
        assertEquals(2, main.solution("111"));
         assertEquals(1, main.solution("1101"));
        assertEquals(5, main.solution("1111101"));
        //assertEquals(1, main.solution("11011"));
        //assertEquals(4, main.solution("1110111"));
        assertEquals(6, main.solution("11101111"));
        assertEquals(3, main.solution("1101111"));
        assertEquals(2, main.solution("110111"));
        assertEquals(1, main.solution("11011"));
        assertEquals(1, main.solution("11011011"));
        assertEquals(2, main.solution("11010111"));
        assertEquals(1, main.solution("11010101"));
        assertEquals(1, main.solution("101"));
        assertEquals(8, main.solution("1110101110111"));
    }

}