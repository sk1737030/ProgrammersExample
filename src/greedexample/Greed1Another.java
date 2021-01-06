package greedexample;

public class Greed1Another {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        int answer = n;

        for (int l : lost)
            people[l - 1]--;
        for (int r : reserve)
            people[r - 1]++;

        for (int i = 0; i < people.length; i++) {
            if (people[i] == -1) {
                if (i - 1 >= 0 && people[i - 1] == 1) {
                    people[i]++;
                    people[i - 1]--;
                } else if (i + 1 < people.length && people[i + 1] == 1) {
                    people[i]++;
                    people[i + 1]--;
                } else
                answer--;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Greed1Another greed1 = new Greed1Another();

        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        int[] lost1 = {2, 4};
        int[] reserve1 = {3};
        int[] lost2 = {3};
        int[] reserve2 = {1};

        System.out.println(greed1.solution(5, lost, reserve)); // 5
        System.out.println(greed1.solution(5, lost1, reserve1)); // 4
        System.out.println(greed1.solution(3, lost2, reserve2)); // 2
    }
}
