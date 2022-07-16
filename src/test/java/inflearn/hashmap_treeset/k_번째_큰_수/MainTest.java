package inflearn.hashmap_treeset.k_번째_큰_수;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
//[160, 159, 157, 156, 155,
// 154, 153, 152, 148, 147,
// 146, 145, 142, 141, 140,
// 139, 138, 137, 135, 134,
// 133, 132, 131, 130, 129,

    @Test
    void test() {
        Main T = new Main();

        assertEquals(141, T.solution(36, 20,
            new Integer[]{
                54, 53, 53, 52, 52,
                50, 49, 48, 48, 47,
                46, 45, 18
            }));
//        assertEquals(141, T.solution(36, 20,
//            new Integer[]{
//                54, 53, 53, 52, 52, 52,
//                50, 50, 49, 48, 48,
//                48, 48, 48, 47, 46,
//                46, 45, 45, 45, 41,
//                41, 40, 40, 39, 38,
//                38, 35, 34, 34, 33,
//                33, 32, 32, 31, 30,
//                30, 30, 28, 28, 27,
//                27, 26, 26, 25, 24,
//                24, 23, 23, 23, 23,
//                22, 21, 21, 21, 20,
//                19, 19, 19, 18,
//            }));
//        assertEquals(141, T.solution(36, 20,
//            new Integer[]{38, 46, 54, 33, 34, 23, 48,
//                50, 23, 26, 46, 47, 25, 48, 35,
//                48, 32, 30, 50, 28, 39, 34, 24,
//                28, 26, 53, 18, 24, 52, 41, 41,
//                33, 23, 52, 27, 22, 45, 30, 52,
//                19, 40, 48, 45, 23, 21, 45, 19,
//                20, 38, 21, 19, 21, 31, 40, 53,
//                27, 49, 48, 30, 32,
//            }));
//        assertEquals(120, T.solution(5, 1, new Integer[]{50, 40, 30, 20, 10}));
//        assertEquals(56, T.solution(10, 1, new Integer[]{11, 12, 33}));
//        assertEquals(-1, T.solution(10, 2, new Integer[]{11, 12, 33}));
//        assertEquals(78, T.solution(10, 1, new Integer[]{11, 12, 33, 33}));
//        assertEquals(77, T.solution(10, 2, new Integer[]{11, 12, 33, 33}));
//        assertEquals(77, T.solution(10, 2, new Integer[]{11, 33, 33, 33}));
//        assertEquals(77, T.solution(10, 2, new Integer[]{11, 33, 33, 33, 11}));
//        assertEquals(77, T.solution(10, 2, new Integer[]{11, 33, 33, 33, 11, 11}));
//        assertEquals(152, T.solution(10, 1, new Integer[]{13, 15, 34, 23, 45, 65, 33, 11, 26, 42}));
//        assertEquals(143, T.solution(10, 3, new Integer[]{13, 15, 34, 23, 45, 65, 33, 11, 26, 42}));
    }

}