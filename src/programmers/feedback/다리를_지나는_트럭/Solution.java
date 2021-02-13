package programmers.feedback.다리를_지나는_트럭;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    List<Integer> movedTruckLengthList = new LinkedList<>();
    Queue<Integer> truckOnBridgeQueue = new LinkedList<>();

    public int solution(final int bridge_length, final int weight, final int[] truck_weights) {
        int answer = 1;
        int currentWeightOnBridge = 0;
        int index = 0;

        while (index < truck_weights.length) {
            int truckWeight = truck_weights[index++];

            if (currentWeightOnBridge + truckWeight <= weight) {
                currentWeightOnBridge += truckWeight;
                truckOnBridgeQueue.offer(truckWeight);
                movedTruckLengthList.add(1);
            } else {
                index--;
            }

            moveTruck();
            currentWeightOnBridge -= checkPassedTruckOfWeight(bridge_length);

            answer++;
        }

        while (!movedTruckLengthList.isEmpty()) {
            moveTruck();
            currentWeightOnBridge -= checkPassedTruckOfWeight(bridge_length);

            answer++;
        }

        return answer;
    }

    private int checkPassedTruckOfWeight(final int bridge_length) {
        int passedTruckOfWeight = 0;

        for (int i = 0; i < movedTruckLengthList.size(); i++) {
            Integer truckLength = movedTruckLengthList.get(i);
            if (truckLength <= bridge_length) {
                break;
            }

            movedTruckLengthList.remove(i--);
            passedTruckOfWeight += truckOnBridgeQueue.poll();
        }
        return passedTruckOfWeight;
    }


    private void moveTruck() {
        for (int i = 0; i < movedTruckLengthList.size(); i++) {
            movedTruckLengthList.set(i, movedTruckLengthList.get(i) + 1);
        }
    }

}

