package inflearn.greedy.결혼식;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 30분 초과
 */
class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(2, T.solution(5, Arrays.asList(
            new Main.Friend( 14, 's'),new Main.Friend( 18,'e'),
            new Main.Friend(12, 's'), new Main.Friend(15,'e'),
            new Main.Friend(15, 's'), new Main.Friend(20,'e'),
            new Main.Friend(20, 's'), new Main.Friend(30,'e'),
            new Main.Friend(5, 's'), new Main.Friend(14,'e'))));

//        assertEquals(9, T.solution(10, new int[][]{
//            {17, 28},
//            {6, 30},
//            {1, 27},
//            {19, 38},
//            {4, 46},
//            {23, 30},
//            {35, 43},
//            {26, 45},
//            {21, 31},
//            {11, 44}
//        }));
    }

}