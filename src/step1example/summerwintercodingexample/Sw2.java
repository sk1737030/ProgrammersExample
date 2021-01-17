package step1example.summerwintercodingexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 예산
 * https://programmers.co.kr/learn/courses/30/lessons/12982
 */
public class Sw2 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        d = Arrays.stream(d).sorted().toArray();
        // Arrays.sort(d); 속도차이 많이난다.

        for (int j : d) {
            sum += j;
            answer++;
            if (sum == budget) {
                return answer;
            } else if (sum > budget) {
                return answer - 1;
            }
        }

        return answer;
    }

    private int fibonacci(int n) {
        if (n < 2) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private int minimalGcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return minimalGcd(n, m % n);
    }

    private int gcd(int m, int n) {
        if (m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }

        if (m % n == 0)
            return n;

        return gcd(n, m % n);
    }

    private int func(int n) {
        if (n == 0) {
            return 0;
        }

        return n + func(n - 1);
    }

    private int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    private static int max = 0;

    private void print2Binary(int n) {
        if (n == 0)
            return;

        print2Binary(n / 2);
        System.out.print(n % 2);
    }

    private int sumArray(int[] arr, int length) {
        if (length == 0) {
            return 0;
        }

        return arr[length - 1] + sumArray(arr, length - 1);
    }


    private void alsearchs(int[] d, ArrayList arr2, int start) {
        if (arr2.size() > 0) {
            System.out.println(arr2.toString());
        }

        for (int i = start; i < d.length; i++) {
            arr2.add(d[i]);
            alsearchs(d, arr2, i + 1);
            arr2.remove(arr2.size() - 1);
        }

    }

    private void getMaxBudgetResult(int[] d, List<Integer> arr, int start, int budget, int sums) {
        int size = arr.size();

        if (sums > budget) {
            return;
        } else if (size > max) {
            max = size;
        }

        for (int i = start; i < d.length; i++) {
            arr.add(d[i]);
            sums += d[i];
            getMaxBudgetResult(d, arr, i + 1, budget, sums);
            arr.remove(arr.size() - 1);
            sums -= d[i];
        }
    }


    private void getMaxBudgetResult2(int[] d, int count, int start, int budget, int sums) {
        int size = count;

        if (sums > budget) {
            return;
        } else if (size > max) {
            max = size;
        }

        for (int i = start; i < d.length; i++) {
            count += 1;
            sums += d[i];
            getMaxBudgetResult2(d, count, i + 1, budget, sums);
            count -= 1;
            sums -= d[i];
        }
    }

    private void al(int[] arr, ArrayList<Integer> arr2, int start, int r) {
        if (r == 0) {
            System.out.println(arr2.toString());
            return;
        }

        for (int i = start; i < arr.length; i++) {
            arr2.add(arr[i]);
            al(arr, arr2, i + 1, r - 1);
            arr2.remove(arr2.size() - 1);
        }
    }

    public static void main(String[] args) {
        Sw2 sw2 = new Sw2();

        int[] d = {1, 2, 3, 4, 5};
        int[] d5 = {2, 3, 4, 5, 6};

/*        List<Integer> arr2 = new ArrayList<>();
        sw2.getMaxBudgetResult(d, arr2, 0, 9, 0);
        System.out.println(max);

        max = 0;

        int[] d6 = new int[1000];
        for (int i = 0; i < 1000; i++) {
            d6[i] = i;
        }

        sw2.getMaxBudgetResult2(d6, 0, 0, 100, 0);
        budget이 100 넘어가면 타입아웃걸림..
        System.out.println(max);
        */
        System.out.println(sw2.solution(d, 9)); // 3
        System.out.println(sw2.solution(d5, 100)); // 0

    }


}
