package programmers.feedback.수포자;


import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class SolutionTest {

    @Test
    public void 수포자() {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution.solution(new int[]{1, 3, 2, 4, 2})));
    }
}
