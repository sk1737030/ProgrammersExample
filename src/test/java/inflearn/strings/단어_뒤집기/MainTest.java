package inflearn.strings.단어_뒤집기;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        List<String> solution = T.solution(Arrays.asList("good", "Time", "Big"));

        assertEquals(Arrays.asList("doog", "emiT", "giB"), solution);
    }

}