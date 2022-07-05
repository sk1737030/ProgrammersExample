package programmers.feedback.스킬트리;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public int solution(final String skill, final String[] skill_trees) {
        int answer = 0;
        for (String skill_tree : skill_trees) {
            String filteredSkill = filteredSkill(skill, skill_tree.split(""));
            if (skill.startsWith(filteredSkill)) {
                answer++;
            }
        }

        return answer;
    }

    private String filteredSkill(final String skill, String[] skill_tree) {
        return Arrays.stream(skill_tree).filter(skill::contains).collect(Collectors.joining());
    }
}
