package inflearn.hashmap_treeset.매출액의_종류;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(List.of(3, 4, 4, 3), T.solution(7, 4, new int[]{20, 12, 20, 10, 23, 17, 10}));
        assertEquals(List.of(2, 2, 2, 2), T.solution(5, 2, new int[]{20, 12, 11, 13, 14}));
    }

}