package hackerrank.tagcontentextractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public void solution(String line) {
        String pattern = "<(.+)>([^<]+)</\\1>";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(line);
        int find = 0;
        while (m.find()) {
            System.out.println(m.group(2));
            find = 1;
        }
        if (find == 0) System.out.println("None");
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            solution.solution(line);
            //Write your code here
            testCases--;
        }
    }
}



