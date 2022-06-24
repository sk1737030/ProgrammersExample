package inflearn.strings.문장_속_단어;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public String solution(String t) {
        String ansewr = "";
        Pattern pattern = Pattern.compile("\\S+");
        Matcher matcher = pattern.matcher(t);

        while (matcher.find()) {
            String group = matcher.group();
            if (ansewr.length() < group.length()) {
                ansewr = group;
            }
        }

        return ansewr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }

}
