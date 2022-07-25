package inflearn.greedy.결혼식;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 시간 초과
 * limit
 * 다시 풀기
 */
public class Main {

    public static class Friend implements Comparable<Friend> {

        int startTime;
        int endTime;

        public Friend(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public int compareTo(Friend o) {
            int compare = Integer.compare(endTime, o.endTime);

            if (compare == 0) {
                return Integer.compare(startTime, o.startTime);
            }

            return compare;
        }
    }

//    public int solution(int n, int[][] arr) {
//        List<Friend> friends = new ArrayList<>();
//
//        for (int[] ints : arr) {
//            friends.add(new Friend(ints[0], ints[1]));
//        }
        public int solution(int n, List<Friend> friends) {
        Collections.sort(friends);

        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < friends.size(); i++) {
            Friend friend = friends.get(i);

            int index = i + 1;
            int cnt = 1;

            while (index < friends.size()) {
                if (friend.endTime > friends.get(index).startTime) {
                    cnt++;
                }


                index++;
            }


            answer = Math.max(cnt, answer);

            if(index < answer) {
                break;
            }
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
            friends.add(new Friend(sc.nextInt(), sc.nextInt()));
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
