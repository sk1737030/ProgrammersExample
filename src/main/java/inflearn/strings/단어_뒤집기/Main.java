package inflearn.strings.단어_뒤집기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public List<String> solution(List<String> str) {
        return str.stream().map(s -> {
            StringBuilder stringBuilder = new StringBuilder(s);
            StringBuilder reverse = stringBuilder.reverse();
            return reverse.toString();
        }).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Main T = new Main();
        List<String> str = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            str.add(scanner.nextLine());
        }

        List<String> solution = T.solution(str);

        for (String s : solution) {
            System.out.println(s);
        }
    }


}
