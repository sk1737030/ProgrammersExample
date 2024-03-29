package inflearn.stack_queue.최대_수입_스케쥴러;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(150,
            T.solution(3,
                Arrays.asList(
                new Main.Scheduler(50, 2),
                new Main.Scheduler(20, 1),
                new Main.Scheduler(40, 2),
                new Main.Scheduler(60, 3),
                new Main.Scheduler(30, 3),
                new Main.Scheduler(30, 1)
                    )));

//        assertEquals(302,
//            T.solution(10, new int[][]{
//                {68, 10},
//                {13, 8},
//                {72, 8},
//                {11, 7},
//                {48, 7},
//                {15, 7},
//                {41, 2},
//                {13, 2},
//                {34, 1},
//                {18, 1}
//            }));
//
//        assertEquals(110,
//            T.solution(6, new int[][]{
//                {50, 2},
//                {30, 3},
//                {30, 1},
//            }));
//
        assertEquals(100, T.solution(2, Arrays.asList(new Main.Scheduler(50, 2),
            new Main.Scheduler(50, 2),
            new Main.Scheduler(30, 2),
            new Main.Scheduler(30, 1))));
//
//        assertEquals(120,
//            T.solution(4, new int[][]{
//                {50, 2},
//                {70, 2},
//                {30, 2},
//                {30, 1},
//            }));
//
//        assertEquals(120,
//            T.solution(4, new int[][]{
//                {50, 2},
//                {70, 2},
//                {30, 2},
//            }));
//
//        assertEquals(207,
//            T.solution(5, new int[][]{
//                {3, 2},
//                {65, 1},
//                {61, 3},
//                {60, 2},
//                {86, 1},
//            }));
//

    }


}