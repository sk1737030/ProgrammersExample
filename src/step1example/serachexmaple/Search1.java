package step1example.serachexmaple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 완전 탐색
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 */
public class Search1 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] temp = new int[3];
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length])
                temp[0]++;
            if (answers[i] == b[i % b.length])
                temp[1]++;
            if (answers[i] == c[i % c.length])
                temp[2]++;
        }

        int maxScore = temp[0];
        if (maxScore < temp[1])
            maxScore = temp[1];
        if (maxScore < temp[2])
            maxScore = temp[2];

        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < temp.length; i++) {
            if (maxScore == temp[i]) {
                array.add(i + 1);
            }
        }

        answer = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i);
        }
        //return array.stream().mapToInt(value -> value).toArray();
        return answer;
    }


    public static void main(String[] args) {
        Search1 search1 = new Search1();
        //int[] answers = {1, 2, 3, 4, 5};
        int[] answers = {1, 3, 2, 4, 2};

        System.out.println(Arrays.toString(search1.solution(answers)));
    }

}

