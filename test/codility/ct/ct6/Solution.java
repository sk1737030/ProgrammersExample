package codility.ct.ct6;

import java.util.*;

public class Solution {

    public int[] solution(int N, int[] coffee_times) {
        int coffeeCnt = 0;

        Barista barista = new Barista(N);

        while (coffeeCnt < coffee_times.length) {
            if (barista.isReceiveCoffee()) {
                barista.addCoffee(new Barista.Coffee(coffeeCnt + 1, coffee_times[coffeeCnt++]));
            } else {
                barista.afterOneSecond();
            }
        }

        while (!barista.waitCoffee.isEmpty()) {
            barista.afterOneSecond();
        }

        System.out.println(barista.completeCoffeeList);

        return barista.completeCoffeeList.stream().mapToInt(i -> i).toArray();
    }

    static class Barista {

        int limit;
        int nowCoffeeCnt; // 현재 커피 CNt
        List<Coffee> waitCoffee = new ArrayList<>(); // 기다리고있는 커피
        List<Integer> completeCoffeeList = new ArrayList<>(); // 끝난 커피

        public Barista(int limit) {
            this.limit = limit;
            this.nowCoffeeCnt = 0;
        }

        public boolean isReceiveCoffee() {
            return nowCoffeeCnt < limit;
        }

        public void addCoffee(Coffee coffee) {
            nowCoffeeCnt++;
            waitCoffee.add(coffee);
        }

        public void afterOneSecond() {
            Queue<Integer> completeQueue = new LinkedList<>();
            waitCoffee.forEach(Coffee::oneSecondPassed);

            for (int i = 0; i < waitCoffee.size(); i++) {
                Coffee coffee = waitCoffee.get(i);
                if (coffee.isEnd()) {
                    waitCoffee.remove(i);
                    completeQueue.offer(coffee.seq);
                    nowCoffeeCnt--;
                    i--;
                }
            }

            completeCoffeeList.addAll(completeQueue);
        }

        static class Coffee {
            int seq;
            int coffeeTimes; // 걸린시간

            public Coffee(int seq, int coffeeTimes) {
                this.seq = seq;
                this.coffeeTimes = coffeeTimes;
            }

            public void oneSecondPassed() {
                coffeeTimes--;
            }

            public boolean isEnd() {
                return coffeeTimes <= 0;
            }
        }
    }
}