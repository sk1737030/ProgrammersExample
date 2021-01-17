package step1example.summerwintercodingexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Sw1Another {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();

        return answer;
    }

    public static void main(String[] args) {
        Sw1 sw1 = new Sw1();

        String skills = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        System.out.println(sw1.solution(skills, skill_trees)); // 2
    }
}

