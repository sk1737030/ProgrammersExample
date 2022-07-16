package inflearn.hashmap_treeset.매출액의_종류;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 4:15
 * 4:30    시간 초과
 */

public class Main {

    public List<Integer> solution(int n, int m, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        Map<Integer, Integer> st = new HashMap<>();

        for (int i = 0; i < m - 1; i++) {
            st.put(arr[i], st.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = m - 1; i < n; i++) {
            st.put(arr[i], st.getOrDefault(arr[i], 0) + 1);
            answer.add(st.size());

            int remove = arr[i - m + 1];
            st.put(remove, st.get(remove) - 1);
            if (st.get(remove) == 0) {
                st.remove(remove);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> answer = T.solution(n, m, arr);

        for (int i = 0; i < answer.size(); i++) {
            System.out.printf(answer.get(i) + " ");
        }


    }


}
