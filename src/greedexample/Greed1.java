package greedexample;


public class Greed1 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] friends = new int[n];

        for (int i = 0; i < n; i++) {
            friends[i] = 1;
        }

        for (int k : reserve) {
            friends[k - 1]++;
        }

        for (int j : lost) {
            friends[j - 1]--;
        }

        for (int i = 0; i < friends.length; i++) {
            if (friends[i] == 0) {
                if (i > 0 && friends[i - 1] == 2) {
                    friends[i - 1] = 1;
                    friends[i] = 1;
                    continue;
                }
                if (i + 1 < friends.length && friends[i + 1] == 2) {
                    friends[i + 1] = 1;
                    friends[i] = 1;
                }
            }
        }

        for (int i : friends) {
            if (i > 0)
                answer += 1;
        }
        return answer;
    }


    public static void main(String[] args) {
        Greed1 greed1 = new Greed1();

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
