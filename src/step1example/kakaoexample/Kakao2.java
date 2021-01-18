package step1example.kakaoexample;

import java.util.Arrays;

/**
 * [카카오인턴] 키패드 누르기
 * https://programmers.co.kr/learn/courses/30/lessons/67256
 */
public class Kakao2 {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int[] curLeft = {3, 0};
        int[] curRight = {3, 2};
        int goRight;
        int goLeft;
        for (int number : numbers) {
            int[] indexs = findIndexs(number);
            if (indexs[1] == 0) {
                // Left
                move(answer, curLeft, indexs, "L");
            } else if (indexs[1] == 2) {
                // Right
                move(answer, curRight, indexs, "R");
            } else {
                // Middle
                goLeft = Math.abs(curLeft[0] - indexs[0]) + Math.abs(curLeft[1] - indexs[1]);
                goRight = Math.abs(curRight[0] - indexs[0]) + Math.abs(curRight[1] - indexs[1]);
                if (goLeft < goRight) {
                    move(answer, curLeft, indexs, "L");
                } else if (goLeft > goRight) {
                    move(answer, curRight, indexs, "R");
                } else {
                    if (hand.equals("right")) {
                        move(answer, curRight, indexs, "R");
                    } else {
                        move(answer, curLeft, indexs, "L");
                    }
                }
            }
        }

        return answer.toString();
    }

    private void move(StringBuilder answer, int[] curIndex, int[] indexs, String l) {
        curIndex[0] = indexs[0];
        curIndex[1] = indexs[1];
        answer.append(l);
    }

    private int[] findIndexs(int number) {
        String[][] pad = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"*", "0", "#"}
        };

        for (int i = 0; i < pad.length; i++) {
            for (int j = 0; j < pad[i].length; j++) {
                if (pad[i][j].equals(String.valueOf(number))) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1};
    }


    public static void main(String[] args) {

        Kakao2 kakao2 = new Kakao2();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(Arrays.toString(numbers));
        System.out.println(kakao2.solution(numbers, hand));//LRLLLRLLRRL
        System.out.println("LRLLLRLLRRL");
    }
}
