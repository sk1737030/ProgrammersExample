package inflearn.hashmap_treeset.k_번째_큰_수;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 17:10
 * 19:17
 * TreeSet과 linkedHasSet차이 때문에 시간 끌었음
 * linkedhashSet은 정렬이 안된다
 * 입력한 순서대로 들어가게된다.
 * 반먄 treeset은 정렬됨.
 */
public class Main {

    int answer;
    int level;
    Set<Integer> st;

    public int solution(int n, int m, Integer[] arr) {
        answer = -1;
        level = 0;
        st = new TreeSet<>(Comparator.reverseOrder());

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            DFS(m, arr, 0, i, 0);
        }

        int cnt = 0;

        for (Integer integer : st) {
            if (cnt == m - 1) {
                return integer;
            }

            cnt++;
        }

        return -1;
    }

    private void DFS(int m, Integer[] arr, int sum, int index, int l) {
        if (l == 3) {
            st.add(sum);
            return;
        }

        if (index >= arr.length) {
            return;
        } else {
            DFS(m, arr, sum + arr[index], index + 1, l + 1);
            DFS(m, arr, sum, index + 1, l);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main T = new Main();
        int answer = T.solution(n, m, arr);

        System.out.println(answer);
    }

}
