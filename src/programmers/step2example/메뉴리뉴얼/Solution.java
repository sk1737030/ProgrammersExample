package programmers.step2example.메뉴리뉴얼;

import java.util.*;

/**
 * 메뉴 리뉴얼
 * https://programmers.co.kr/learn/courses/30/lessons/72411
 */
public class Solution {

    public String[] solution(String[] orders, int[] course) {
        final List<String> combList = new ArrayList<>();

        List<String> answer = new ArrayList<>();
        boolean[] visited = new boolean[orders.length + 10];

        for (String order : orders) {
            combination(order, visited, 0, combList);
        }

        Map<String, Integer> menuMap = new HashMap<>();

        for (String s : combList) {
            menuMap.put(s, menuMap.getOrDefault(s, 0) + 1);
        }

        int[] menuCnt = new int[orders.length + 10];

        // 각 조합된 메뉴 별 최대 Cnt 값을 저장
        for (final int i : course) {
            menuMap.forEach((s, cnt) -> {
                // 호출된 메뉴가 2번 이상일 때
                if (s.length() == i && cnt > 1) {
                    menuCnt[i] = Math.max(menuCnt[i], cnt);
                }
            });
        }

        // 메뉴를 돌면서 최대 Cnt인 녀석들을 List에 추가.
        menuMap.forEach((s, integer) -> {
            if (menuCnt[s.length()] == integer) {
                answer.add(s);
            }
        });

        Collections.sort(answer);

        return answer.toArray(new String[]{});
    }

    private void combination(String order, boolean[] visited, int depth, List<String> combList) {
        StringBuilder comb = new StringBuilder();

        for (int j = 0; j < order.length(); j++) {
            if (visited[j]) {
                comb.append(order.charAt(j));
            }
        }

        if (comb.length() > 1) {
            char[] a = comb.toString().toCharArray();
            Arrays.sort(a);
            combList.add(String.valueOf(a));
        }

        for (int i = depth; i < order.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                combination(order, visited, i, combList);
                visited[i] = false;
            }
        }
    }
}
