package programmers.step2example.kakaexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 후보키
 * https://programmers.co.kr/learn/courses/30/lessons/42890
 * 일단 보류
 */
public class KaKao3_2 {


    Set<String> set = new LinkedHashSet<>();
    List<String> list = new ArrayList<>();
    List<ArrayList<String>> listArrayList = new ArrayList<>();

    public int solution(String[][] relation) {
        int answer = 0;
        int columnLength = relation[0].length;
        int tupleLength = relation.length;

        boolean[] visited = new boolean[columnLength];

        doCombination(visited, columnLength, 0);


        List<String> skipList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            String[] split = list.get(i).split("");

 /*           if (skipList.stream().anyMatch(s -> s.startsWith(split[0]))) {
                continue;
            }*/

            for (int j = 0; j < relation.length; j++) {
                StringBuilder sb = new StringBuilder();

                for (String s : split) {
                    sb.append(relation[j][Integer.parseInt(s)]);
                    sb.append(" ");
                }

/*                if (set.contains(sb.toString())) {
                    test = false;
                    break;
                } else {
                    set.add(sb.toString());
                    test = true;
                }*/
                set.add(sb.toString());
            }

            if (set.size() == tupleLength) {
                boolean flag = true;

                ArrayList<String> cKey = new ArrayList<>(Arrays.asList(list.get(i).split("")));

                for (int j = 0; j < listArrayList.size(); j++) {
                    System.out.println(cKey);
                    System.out.println(listArrayList.get(j));
                    System.out.println(cKey.containsAll(listArrayList.get(j)));
                    System.out.println(listArrayList.get(j).containsAll(cKey));
                    if (cKey.containsAll(listArrayList.get(j))) {
                        flag = false;
                        break;
                    }
                }

                /*for (int j = 0; j < listArrayList.size(); j++) {
                    if (cKey.containsAll(listArrayList.get(j))) {
                        flag = false;
                        break;
                    }
                }*/

                if (flag)
                    listArrayList.add(cKey);
            }

            set.clear();

            /*if (test) {
                skipList.add(String.join("", split));
                System.out.println(Arrays.toString(split));
                //System.out.println(set);
                answer++;
            } else {
                test = true;
            }*/
        }

        return listArrayList.size();
    }

    public static void main(String[] args) {
        KaKao3_2 kaKao3 = new KaKao3_2();
     /*  String[][] relation = {
                {"100", "ryan", "music", "2"},
                {"200", "apeach", "math", "2"},
                {"300", "tube", "computer", "3"},
                {"400", "con", "computer", "4"},
                {"500", "muzi", "music", "3"},
                {"600", "apeach", "music", "2"}
        };*/
 /*       String[][] relation = {
                {"ab", "c", "1"},
                {"a", "bc", "2"},
                {"xc", "bc", "3"},
                {"xc", "d", "1"}
        };*/
        String[][] relation = {
                {"a", "bc", "music", "2"},
                {"ab", "a", "math", "3"},
                {"ab", "c", "math", "2"}
        };


        System.out.println(kaKao3.solution(relation)); //2
        // System.out.println(kaKao3.solution2(arr)); //2
    }

    private void doCombination(final boolean[] visited, final int n, final int columnIndex) {
        combine(n, visited);
        for (int i = columnIndex; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                doCombination(visited, n, i);
                visited[i] = false;
            }
        }
    }

    private void combine(int n, boolean[] visited) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (visited[i])
                sb.append(i);
        }
        if (sb.length() > 0)
            list.add(sb.toString());
    }


}
