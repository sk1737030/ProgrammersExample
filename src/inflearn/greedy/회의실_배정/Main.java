package inflearn.greedy.회의실_배정;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static class Meeting implements Comparable<Meeting> {

        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting o) {
            int compare = Integer.compare(end, o.end);
            if (compare == 0) {
                return Integer.compare(start, o.start);
            } else {
                return compare;
            }
        }
    }

    public int solution(List<Meeting> meetings) {
        Collections.sort(meetings);
        int answer = 0;

        int end = 0;
        for (Meeting meeting : meetings) {
            if (meeting.start >= end) {
                answer++;
                end = meeting.end;
            }
        }
//        for (int i = 0; i < meetings.size(); i++) {
//            int temp = 1;
//            Meeting meeting = meetings.get(i);
//            for (int j = i + 1; j < meetings.size(); j++) {
//                Meeting other = meetings.get(j);
//                if (meeting.end <= other.start) {
//                    temp++;
//                    meeting = other;
//                }
//            }
//
//            answer = Math.max(answer, temp);
//            break;
        //}

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int i = kb.nextInt();
        List<Meeting> arr = new ArrayList<>();

        for (int j = 0; j < i; j++) {
            int i1 = kb.nextInt();
            int i2 = kb.nextInt();
            arr.add(new Meeting(i1, i2));
        }

        System.out.println(T.solution(arr));
    }

}
