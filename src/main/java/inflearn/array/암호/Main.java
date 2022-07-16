package inflearn.array.암호;

import java.util.Scanner;

public class Main {

    public String solution(int n, String arg) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String temp = arg.substring(0, 7).replace("#", "1").replace("*", "0");
            answer += (char) Integer.parseInt(temp, 2);
            arg = arg.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String ar = sc.nextLine();
        System.out.println(ar);
        String answer = T.solution(n, ar);
        System.out.println(answer);
    }


}
