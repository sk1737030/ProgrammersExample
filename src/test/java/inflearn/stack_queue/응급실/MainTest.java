package inflearn.stack_queue.응급실;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(5, T.solution(6, 0, new int[]{60, 60, 90, 60, 60, 60}));
        assertEquals(10, T.solution(15, 5, new int[]{63 ,53 ,87 ,91 ,83 ,72 ,83 ,92 ,63 ,68 ,88 ,74 ,51 ,82 ,89}));
        assertEquals(18, T.solution(50, 15, new int[]{77, 92, 64, 94, 83, 82, 69, 89, 74,
                79, 85, 65, 82, 82, 85, 79, 68, 79, 63, 77, 93, 58, 78, 75, 86, 85,
                90, 77, 57, 51, 56, 69, 53, 56, 67, 64, 84, 92, 52, 54, 74, 50, 66, 72, 87, 54, 66,
                98, 55, 55}));
        assertEquals(3, T.solution(5, 2, new int[]{60, 50, 70, 80, 90}));
        assertEquals(4, T.solution(6, 3, new int[]{70, 60, 90, 60, 60, 60}));
    }

}