package programmers.step2example.kakaoexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 후보키
 * https://programmers.co.kr/learn/courses/30/lessons/42890
 */
public class KaKao3 {


    Set<String> set = new LinkedHashSet<>();
    List<String> list = new ArrayList<>();
    List<ArrayList<String>> listArrayList = new ArrayList<>();

    public int solution(String[][] relation) {
        int columnLength = relation[0].length;
        int tupleLength = relation.length;

        boolean[] visited = new boolean[columnLength];

        doCombination(visited, columnLength, 0);

        list.sort((o1, o2) -> {
            if (o1.charAt(0) == o2.charAt(0)) {
                return Integer.compare(Integer.parseInt(o1), Integer.parseInt(o2));
            }
            return o1.compareTo(o2);
        });

        for (String value : list) {
            String[] split = value.split("");

            for (String[] item : relation) {
                StringBuilder sb = new StringBuilder();

                for (String s : split) {
                    sb.append(item[Integer.parseInt(s)]);
                    sb.append(" ");
                }

                set.add(sb.toString());
            }

            if (set.size() == tupleLength) {
                ArrayList<String> cKey = new ArrayList<>(Arrays.asList(split));

                boolean[] bol = new boolean[1];

                listArrayList.forEach(strings -> {
                    if (cKey.containsAll(strings)) {
                        bol[0] = true;
                    }
                });

                if (!bol[0]) {
                    listArrayList.add(cKey);
                }
            }

            set.clear();
        }


        int size = listArrayList.size();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (listArrayList.get(i).containsAll(listArrayList.get(j))) {
                    listArrayList.get(i).clear();
                }
            }
        }

        return (int) listArrayList.stream().filter(strings -> !strings.isEmpty()).count();
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

    public static void main(String[] args) {
        KaKao3 kaKao3 = new KaKao3();
        /*String[][] relation = {
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

        /*String[][] relation = {
                {"a", "bc", "music", "2"},
                {"ab", "a", "math", "3"},
                {"ab", "c", "math", "2"}
        };*/
        /*String[][] relation = {
                {"a", "music", "bc", "2"},
                {"ab", "math", "a", "3"},
                {"ab", "math", "c", "2"}
        };*/
        String[][] relation = {
                {"a", "music", "bc", "2"},
                {"ab", "math", "a", "3"},
                {"ab", "math", "c", "2"}
        };

        System.out.println(kaKao3.solution(relation)); //2
        // System.out.println(kaKao3.solution2(arr)); //2
    }

}
