package inflearn.greedy.씨름_선수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public int solution(List<Person> people) {
        int answer = 0;

        people.sort((o1, o2) -> Integer.compare(o2.height, o1.height));

        int maxWeight = 0;

        for (Person person : people) {
            if (maxWeight < person.weight) {
                answer++;
                maxWeight = person.getWeight();
            }
        }

        return answer;
    }

    static class Person {

        int height;
        int weight;

        @Override
        public String toString() {
            return "Person{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
        }

        public int getWeight() {
            return weight;
        }

        public Person(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int i = kb.nextInt();
        ArrayList<Person> arr = new ArrayList<>();

        for (int j = 0; j < i; j++) {
            int i1 = kb.nextInt();
            int i2 = kb.nextInt();
            arr.add(new Person(i1, i2));
        }

        System.out.println(T.solution(arr));
    }
}
