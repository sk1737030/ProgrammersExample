package step2example.stackqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 다리를 지나는 트럭
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 */
public class StackQueue2 {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 1;
        int currentSumWeightOnBridge = 0; // 다리위에있는 트럭의 총 무게
        int index = 0;

        List<Integer> truckOnBridgeList = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();

        while (!truckOnBridgeList.isEmpty() || index != truck_weights.length) {
            time++;

            if (index != truck_weights.length) {
                int truckWeight = truck_weights[index];

                if (currentSumWeightOnBridge + truckWeight <= weight) {
                    currentSumWeightOnBridge += truckWeight;

                    queue.add(truckWeight);
                    truckOnBridgeList.add(bridge_length);
                    index++; // 다음 차 진입.
                }
            }
            for (int i = 0; i < truckOnBridgeList.size(); i++) {
                Integer truckBridgeLength = truckOnBridgeList.get(i) - 1; // 트럭이 얼마만큼 진행했는지
                truckOnBridgeList.set(i, truckBridgeLength); // - 1 한칸씩 지나감

                if (truckBridgeLength == 0) { // 트럭이 length 만큼 지나갔으면
                    Integer passedTruckWeightOnBridge = queue.poll(); // 다리위에있는 트럭 삭제
                    truckOnBridgeList.remove(i);
                    i--;
                    currentSumWeightOnBridge -= passedTruckWeightOnBridge; // 다리위에있는 트럭 무게 빼기
                }
            }

        }

        return time;
    }

    public static void main(String[] args) {

        StackQueue2 stackQueue2 = new StackQueue2();
        //int bridge_length = 2;
        //int weight = 10;
        //int[] truck_weights = {7, 4, 5, 6};
        //int bridge_length = 100;
        //int weight = 100;
        //int[] truck_weights = {10};
        //int bridge_length = 100;
        //int weight = 100;
        //int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}; // 110
        int bridge_length = 5;
        int weight = 5;
        //int[] truck_weights = {2, 1}; // 19
        int[] truck_weights = {2, 2, 2, 2, 1, 1, 1, 1, 1}; // 19
        System.out.println(stackQueue2.solution(bridge_length, weight, truck_weights)); // 8


    }
}
