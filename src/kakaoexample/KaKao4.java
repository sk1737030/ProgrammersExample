package kakaoexample;

import java.util.Arrays;

/**
 * 실패율
 * https://programmers.co.kr/learn/courses/30/lessons/42889
 */
public class KaKao4 {
    public int[] solution(int n, int[] stages) {
        int[] answer = new int[n];
        double[] stageChallenge = new double[n];
        int[] stageSuccess = new int[n];
        double[] stageFailure = new double[n];


        for (int i = 0; i < n; i++) {
            for (int stage : stages) {
                if (stage >= i + 1) {
                    stageChallenge[i] = stageChallenge[i] + 1;
                }
                if (stage > i + 1) {
                    stageSuccess[i] = stageSuccess[i] + 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            stageFailure[i] = (double) stageSuccess[i] / stageChallenge[i];
        }

        double[] doubles = Arrays.stream(stageFailure).sorted().toArray();

        for (int j = 0; j < doubles.length; j++) {
            for (int k = 0; k < stageFailure.length; k++) {
                if (Double.compare(doubles[j], stageFailure[k]) == 0 && stageFailure[k] != -1) {
                    answer[j] = k + 1;
                    stageFailure[k] = -1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        KaKao4 kaKao4 = new KaKao4();
        int stage1 = 5;
        int[] arr = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(kaKao4.solution(stage1, arr)));// 	[3,4,2,1,5]
        /*int stage2 = 4;
        int[] arr2 = {4, 4, 4, 4};
        kaKao4.solution(stage2, arr2);// 	[3,4,2,1,5]*/
    }
}
