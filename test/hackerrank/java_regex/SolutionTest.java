package hackerrank.java_regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        solution.solution("121.234.12.12"); // true
        solution.solution("5901.12.12.034");
        solution.solution("Hello.IP.IP.IP");
        solution.solution("122.23");
        solution.solution("122.259.259.259");//false
        solution.solution("111.111.11.111");//false
    }
}