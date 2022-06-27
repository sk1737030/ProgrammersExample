package inflearn.bfs_dfs.토마토;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {

        Main T = new Main();

        int[][] arr = {
            {0, 0, -1, 0, 0, 0},
            {0, 0, 1, 0, -1, 0},
            {0, 0, -1, 0, 0, 0},
            {0, 0, 0, 0, -1, 1}
        };

        LinkedList<Main.Point> arr1 = new LinkedList<>();
        arr1.add(new Main.Point(1, 2));
        arr1.add(new Main.Point(3, 5));

        int solution = T.solution(arr, arr1);
        assertEquals(4, solution);

        int[][] arr2 = {
            {0, 0, -1, 0, 0, 0},
            {0, 0, 1, 0, -1, 0},
        };

        LinkedList<Main.Point> arr3 = new LinkedList<>();
        arr3.add(new Main.Point(1, 2));

        int solution2 = T.solution(arr2, arr3);
        assertEquals(5, solution2);

    }


}