package programmers.feedback.올바른괄호;

public class Solution {

    boolean solution(String s) {
        int leftCnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftCnt++;
            } else {
                if (leftCnt == 0) {
                    return false;
                }
                leftCnt--;
            }
        }

        return leftCnt == 0;
    }
}
