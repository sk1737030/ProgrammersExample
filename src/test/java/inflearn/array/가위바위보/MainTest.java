package inflearn.array.가위바위보;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        List<String> answer = T.solution(new int[]{2, 3, 3, 1, 3}, new int[]{1, 1, 2, 2, 3});
        assertEquals(Arrays.asList("A", "B", "A", "B", "D"), answer);
    }

}