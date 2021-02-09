package programmers.feedback.전화번호_목록;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    public boolean solution(final String[] phoneBook) {
        Deque<String> phoneStack = new ArrayDeque<>(Arrays.asList(phoneBook));

        while (!phoneStack.isEmpty()) {
            String pop = phoneStack.pop();
            for (int i = phoneStack.size() - 1; i >= 0; i--) {
                if (bothWayStartWith(phoneBook[i], pop)) {
                    return false;
                }
            }
        }

        return true;
    }


    private boolean bothWayStartWith(final String s, final String pop) {
        return s.startsWith(pop) || pop.startsWith(s);
    }
}
