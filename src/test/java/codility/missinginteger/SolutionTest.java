package codility.missinginteger;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        int[] given = {4, 1, 2, 3};
        int answer = solution.solution(given);
        assertEquals(5, answer);

        int[] given2 = {-1, -3};
        int answer2 = solution.solution(given2);
        assertEquals(1, answer2);

        int[] given3 = {1, 3, 6, 4, 1, 2};
        int answer3 = solution.solution(given3);
        assertEquals(5, answer3);

        int[] given4 = {-1, 3, 6, 4, 1, 2};
        int answer4 = solution.solution(given4);
        assertEquals(5, answer4);

        int[] given5 = {2};
        int answer5 = solution.solution(given5);
        assertEquals(1, answer5);

        int[] given6 = {2, 3, 4, 5, 6};
        int answer6 = solution.solution(given6);
        assertEquals(1, answer6);

        int[] given7 = {-2, -3, -4, -5, -6};
        int answer7 = solution.solution(given7);
        assertEquals(1, answer7);

        int[] given8 = {1, -2, 0, 3};
        int answer8 = solution.solution(given8);
        assertEquals(2, answer8);

        int[] given9 = {-2, 2, 4, 3};
        int answer9 = solution.solution(given9);
        assertEquals(1, answer9);

        int[] given10 = {-1};
        int answer10 = solution.solution(given10);
        assertEquals(1, answer10);

        int[] given11 = {1};
        int answer11 = solution.solution(given11);
        assertEquals(2, answer11);

        int[] given12 = {2, 3, 4};
        int answer12 = solution.solution(given12);
        assertEquals(1, answer12);

        int[] given13 = {0, 1, 2, 3, 4, 5, 6};
        int answer13 = solution.solution(given13);
        assertEquals(7, answer13);

    }

}