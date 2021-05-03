package hackerrank.java_regex;

import java.util.Scanner;

class Solution {
    public void solution(String IP) {
        System.out.println(IP.matches(new MyRegex().pattern));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();
        while (in.hasNext()) {
            String IP = in.next();
            solution.solution(IP);
        }
    }


}

//Write your code here
class MyRegex {
    public String pattern = "^([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.{1,1}([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.{1,1}([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.{1,1}([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])$";
}



