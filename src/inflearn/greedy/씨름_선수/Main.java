package inflearn.greedy.씨름_선수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public int solution(int[][] arr) {
        int answer = arr.length;

        List<Person> people = new ArrayList<>();

        for (int[] ints : arr) {
            people.add(new Person(ints[0], ints[1]));
        }

        people.sort((o1, o2) -> Integer.compare(o2.height, o1.height));

        int maxWeight = people.get(0).weight;

        for (int i = 1; i < people.size(); i++) {
            Person person = people.get(i);

            if (maxWeight > person.weight) {
                answer--;
            } else {
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

        public int getHeight() {
            return height;
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
        Scanner in = new Scanner(System.in);
        int input = Integer.parseInt(in.nextLine());

        int[][] arr = new int[input][2];

        for (int i = 0; i < input; i++) {
            String next = in.nextLine();
            String[] s = next.split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }

        Main main = new Main();
        System.out.println(main.solution(arr));
    }
}
