package programmers.step1example.summerwintercodingexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 스킬트리
 * https://programmers.co.kr/learn/courses/30/lessons/49993
 */
public class Sw1 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        int skillLevel = 0;
        boolean skillTree = true;
        List<String> skill_list = Arrays.stream(skill.split("")).collect(Collectors.toList());

        StringBuffer stringBuffer = null;

        for (String str : skill_trees) {
            stringBuffer = new StringBuffer(str);

            for (int i = 0; i < stringBuffer.length(); i++) {
                String o = String.valueOf(stringBuffer.charAt(i));
                if (skill_list.contains(o)) {
                    if (skill_list.get(skillLevel).equals(o)) {
                        skillLevel++;
                    } else {
                        skillTree = false;
                        break;
                    }
                }
            }

            if (skillTree) {
                answer++;
            }
            skillLevel = 0;
            skillTree = true;
        }


        return answer;
    }

    public static void main(String[] args) {
        Sw1 sw1 = new Sw1();

        String skills = "G";
        //String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        String[] skill_trees = {"CBADF"};

        System.out.println(sw1.solution(skills, skill_trees)); // 2
    }
}
