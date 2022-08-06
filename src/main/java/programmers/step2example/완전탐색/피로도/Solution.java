package programmers.step2example.완전탐색.피로도;

public class Solution {

    int answer = Integer.MIN_VALUE;

    public int solution(int k, int[][] dungeons) {
        int size = dungeons.length;
        int[] ints = new int[size];
        boolean[] check = new boolean[size];
        DFS(k, size, dungeons, 0, check, ints);

        return answer;
    }

    private void DFS(int k, int size, int[][] dungeons, int i, boolean[] check, int[] ph) {
        if (i == size) {
            int hp = k;
            int cnt = 0;
            for (int p : ph) {
                int[] dungeon = dungeons[p];
                int hea = dungeon[0];
                int nHe = dungeon[1];
                if (hp >= hea) {
                    hp -= nHe;
                    cnt++;
                } else {
                    break;
                }
            }
            answer = Math.max(answer, cnt);
        } else {
            for (int j = 0; j < size; j++) {
                if (!check[j]) {
                    check[j] = true;
                    ph[i] = j;
                    DFS(k, size, dungeons, i + 1, check, ph);
                    check[j] = false;
                }
            }
        }

    }


}
