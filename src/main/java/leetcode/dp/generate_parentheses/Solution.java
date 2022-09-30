package leetcode.dp.generate_parentheses;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        dfs(answer, 0, 0, n, "");
        return answer;
    }

    private void dfs(List<String> answer, int l, int r, int n, String temp) {
        if (r == 3 && l == 3) {
            answer.add(temp);
        }

        if(l < r)
            return;

        if (l < n) {
            dfs(answer, l + 1, r, n, temp + "(");
        }

        if (r < n ) {
            dfs(answer, l, r + 1, n, temp + ")");
        }

    }
}