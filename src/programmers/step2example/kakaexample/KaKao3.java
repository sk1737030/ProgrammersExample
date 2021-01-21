package programmers.step2example.kakaexample;

import java.util.HashSet;
import java.util.Set;

/**
 * 후보키
 * https://programmers.co.kr/learn/courses/30/lessons/42890
 * 일단 보류
 */
public class KaKao3 {

    public int solution(String[][] relation) {
        int answer = 0;
        int index = 0;
        boolean judge = true;
        Set<String> set = new HashSet();

        int column = relation[0].length;
        int tuple = relation.length;

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < tuple; j++) {
//                if (bfs(relation, visited, i, j, 0)) {

                //              }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        KaKao3 kaKao3 = new KaKao3();
        String[][] relation = {
                {"100", "ryan", "music", "2"},
                {"200", "apeach", "math", "2"},
                {"300", "tube", "computer", "3"},
                {"400", "con", "computer", "4"},
                {"500", "muzi", "music", "3"},
                {"600", "apeach", "music", "2"}
        };
        System.out.println(kaKao3.solution(relation)); //2
    }

}
