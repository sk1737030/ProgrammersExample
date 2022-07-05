package inflearn.strings.가장_짧은_문자거리;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public Integer[] solution(String str, char hidden) {

        char[] chars = str.toCharArray();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar == hidden) {
                arr.add(0);
            } else {
                int leftIndex = i;
                int rightIndex = i;
                int cnt = 0;
                while (true) {
                    if ((leftIndex >= 0 && chars[leftIndex--] == hidden) || (rightIndex < chars.length && chars[rightIndex++] == hidden)) {
                        arr.add(cnt);
                        break;
                    }
                    cnt++;
                }
            }
        }

        return arr.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char hidden = sc.next().charAt(0);
        Integer[] arr = T.solution(str, hidden);
        for (int i : arr) {
            System.out.printf(i + " ");
        }

    }


}
