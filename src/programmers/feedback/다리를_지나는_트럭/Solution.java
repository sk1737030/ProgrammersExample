package programmers.feedback.다리를_지나는_트럭;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(final int bridge_length, final int weight, final int[] truck_weights) {
        int answer = 1;

        Bridge bridge = new Bridge(bridge_length, weight);

        int index = 0;

        while (index < truck_weights.length) {
            Truck truck = new Truck(truck_weights[index++]);
            if (bridge.isOverWeight(truck.weight)) {
                truck.move();
                bridge.moveTruckToBridge(truck);
            } else {
                index--;
            }

            bridge.moveTrucksOnBridge();
            bridge.removePassedTruck();
            answer++;
        }

        while (bridge.hasTruckOnBridge()) {
            bridge.moveTrucksOnBridge();
            bridge.removePassedTruck();
            answer++;
        }

        return answer;
    }

    static class Bridge {
        private int currentWeightOnBridge;
        private final int bridgeLength;
        private final int weight;
        Queue<Truck> truckOnBridgeQueue = new LinkedList<>();

        public Bridge(int bridge_length, int weight) {
            this.bridgeLength = bridge_length;
            this.weight = weight;
            currentWeightOnBridge = 0;
        }

        public void removePassedTruck() {
            truckOnBridgeQueue.removeIf(truck -> {
                boolean arrived = truck.getMovedLength() > bridgeLength;
                if (arrived) {
                    currentWeightOnBridge -= truck.weight;
                }
                return arrived;
            });
        }

        public boolean isOverWeight(int truckWeight) {
            return currentWeightOnBridge + truckWeight <= weight;
        }

        public void moveTruckToBridge(Truck truck) {
            currentWeightOnBridge += truck.weight;
            truckOnBridgeQueue.offer(truck);
        }

        public void moveTrucksOnBridge() {
            truckOnBridgeQueue.forEach(Truck::move);
        }

        public boolean hasTruckOnBridge() {
            return !truckOnBridgeQueue.isEmpty();
        }
    }

    static class Truck {
        private final int weight;
        private int movedLength;

        public Truck(int weight) {
            this.weight = weight;
            this.movedLength = 0;
        }

        public void move() {
            ++movedLength;
        }

        public int getMovedLength() {
            return movedLength;
        }

        @Override
        public String toString() {
            return "Truck{" +
                    "weight=" + weight +
                    ", movedLength=" + movedLength +
                    '}';
        }
    }


}

