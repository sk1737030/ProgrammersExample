package inflearn.greedy.회의실_배정;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        List<Main.Meeting> meetings = Arrays.asList(
            new Main.Meeting(1, 4),
            new Main.Meeting(2, 3),
            new Main.Meeting(3, 5),
            new Main.Meeting(4, 6),
            new Main.Meeting(5, 7)
        );

        int solution = T.solution(meetings);
        assertEquals(3, solution);

        List<Main.Meeting> meetings2 = Arrays.asList(
            new Main.Meeting(3, 3),
            new Main.Meeting(1, 3),
            new Main.Meeting(2, 3)
        );

        int solution2 = T.solution(meetings2);
        assertEquals(2, solution2);
    }

}