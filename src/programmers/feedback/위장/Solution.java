package programmers.feedback.위장;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        int maxValue = 0;

        for (String[] clothe : clothes) {
            int get = hashMap.getOrDefault(clothe[1], 0) + 1;
            maxValue = Math.max(maxValue, get);
            hashMap.put(clothe[1], get);
        }

        int[][] map = new int[hashMap.size()][maxValue];
        int[] visited = new int[map.length];
        Integer[] valuesArray = hashMap.values().toArray(new Integer[0]);

        for (int i = 0; i < map.length; i++) {
            Integer value = valuesArray[i];
            for (int j = 0; j < value; j++) {
                map[i][j] = 1;
            }
        }

        System.out.println(Arrays.deepToString(map));
        dfs(map, visited, 0, 0);

        return -1;
    }

    public void dfs(int[][] map, int[] visited, int depth, int k) {

        visited[depth] = 1;
        System.out.print(map[depth][k]);

        for (int i = 0; i < map.length; i++) {
            if (map[depth][i] == 1 && visited[i] == 0) {
                dfs(map, visited, i, k);
            }
        }
    }

}
