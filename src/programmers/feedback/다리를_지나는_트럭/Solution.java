package programmers.feedback.다리를_지나는_트럭;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private int answer = 1;

    public int solution(final int bridge_length, final int weight, final int[] truck_weights) {

        int index = 0;
        Bridge bridge = new Bridge(bridge_length, weight);

        while (index < truck_weights.length) {
            Truck truck = new Truck(truck_weights[index++]);
            if (!bridge.isOverWeight(truck.weight)) {
                bridge.moveTruckToBridge(truck);
            } else {
                index--;
            }

            oneSecondPassed(bridge);
        }

        while (bridge.hasTruckOnBridge()) {
            oneSecondPassed(bridge);

        }

        return answer;
    }

    private void oneSecondPassed(Bridge bridge) {
        bridge.moveTrucksOnBridge();
        if (bridge.hasArrivedTruck()) {
            bridge.removePassedTruck();
        }

        answer++;
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
            return currentWeightOnBridge + truckWeight > weight;
        }

        public void moveTruckToBridge(Truck truck) {
            truck.move();
            currentWeightOnBridge += truck.weight;
            truckOnBridgeQueue.offer(truck);
        }

        public void moveTrucksOnBridge() {
            truckOnBridgeQueue.forEach(Truck::move);
        }

        public boolean hasTruckOnBridge() {
            return !truckOnBridgeQueue.isEmpty();
        }

        public boolean hasArrivedTruck() {
            return truckOnBridgeQueue.stream().anyMatch(truck -> truck.getMovedLength() > bridgeLength);
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


