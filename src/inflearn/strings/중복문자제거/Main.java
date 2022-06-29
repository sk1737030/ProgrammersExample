package inflearn.strings.중복문자제거;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
//        return str.chars()
//            .mapToObj(value -> (char) value)
//            .distinct()
//            .map(Object::toString)
//            .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String result = T.solution(line);
        System.out.println(result);
    }


}
