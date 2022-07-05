package programmers.step1example.kakaoexample;

import java.util.Arrays;

/**
 * 비밀지도
 * https://programmers.co.kr/learn/courses/30/lessons/17681
 */
public class KaKao4 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binaryArr1 = new String[n];
        String[] binaryArr2 = new String[n];

        for (int i = 0; i < n; i++) {
            String binaryString = Integer.toBinaryString(arr1[i]);
            String binaryString1 = Integer.toBinaryString(arr2[i]);

            while (binaryString.length() != n) {
                binaryString = '0' + binaryString;
            }
            while (binaryString1.length() != n) {
                binaryString1 = '0' + binaryString1;
            }

            binaryArr1[i] = binaryString;
            binaryArr2[i] = binaryString1;
        }

        for (int j = 0; j < n; j++) {
            String replace1 = binaryArr1[j].replace('1', '#').replace('0', ' ');
            String replace2 = binaryArr2[j].replace('1', '#').replace('0', ' ');
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < n; i++) {

                if (replace1.charAt(i) == '#' || replace2.charAt(i) == '#') {
                    str.append('#');
                } else {
                    str.append(' ');
                }
            }
            answer[j] = str.toString();
        }

        return answer;
    }

    public static void main(String[] args) {
        KaKao4 kaKao4 = new KaKao4();

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        int n1 = 6;
        int[] arr3 = {46, 33, 33, 22, 31, 50};
        int[] arr4 = {27, 56, 19, 14, 14, 10};

        //   System.out.println(Arrays.toString(kaKao4.solution(n, arr1, arr2)));
        System.out.println(Arrays.toString(kaKao4.solution(n1, arr3, arr4)));
    }
}
