package inflearn.greedy.결혼식;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 시간 초과 limit
 * 다시 풀기
 */
public class Main {

    public static class Friend implements Comparable<Friend> {

        int time;
        Character state;

        public Friend(int time, Character state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Friend o) {
            int compare = Integer.compare(this.time, o.time);

            if (compare == 0) {
                return Character.compare(this.state, o.state);
            }

            return compare;
        }
    }

    public int solution(int n, List<Friend> friends) {
        Collections.sort(friends);

        int answer = 0;
        int cnt = 0;

        for (Friend friend : friends) {
            if (friend.state == 'e') {
                cnt--;
            } else {
                cnt++;
            }

            answer = Math.max(cnt, answer);
        }

        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        //int[][] arr = new int[n][2];
        List<Friend> friends = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            friends.add(new Friend(sc.nextInt(), 's'));
            friends.add(new Friend(sc.nextInt(), 'e'));
        }
//        for (int i = 0; i < n; i++) {
//
//            arr[i][0] = sc.nextInt();
//            arr[i][1] = sc.nextInt();
//        }

        int answer = T.solution(n, friends);

        System.out.println(answer);
    }

}
