package inflearn.two_pointers.두_배열_합치기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public List<Integer> solution(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        result.addAll(Arrays.stream(arr1).boxed().collect(Collectors.toList()));
        result.addAll(Arrays.stream(arr2).boxed().collect(Collectors.toList()));
        result.sort(Integer::compare);
        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }

        List<Integer> result = T.solution(arr1, arr2);
        for (Integer integer : result) {
            System.out.printf(integer + " ");
        }

    }


}
