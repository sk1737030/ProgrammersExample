package programmers.step2example.kakaexample;

import java.util.ArrayList;
import java.util.List;

/**
 * 문자열 압축
 * https://programmers.co.kr/learn/courses/30/lessons/60057
 */
public class KaKao4 {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder tempSb = new StringBuilder(s);
        int minCnt = s.length();
        int count = 1;

        int length = s.length();
        for (int i = 1; i <= length / 2; i++) {
            List<String> strList = makeCompressList(tempSb, i, length);
            for (int j = 0; j < strList.size(); j++) {
                if (j + 1 >= strList.size() || !strList.get(j).equals(strList.get(j + 1))) {
                    if (count > 1) {
                        sb.append(count);
                    }
                    sb.append(strList.get(j));
                    count = 0;
                }
                count++;
            }
            minCnt = Math.min(minCnt, sb.length());
            sb = new StringBuilder();
        }

        return minCnt;
    }

    private List<String> makeCompressList(StringBuilder tempSb, int i1, int length) {
        List<String> sbList = new ArrayList<>();
        int startIndex = 0;

        while (startIndex < length) {
            if (startIndex + i1 > length) {
                sbList.add(tempSb.substring(startIndex));
                break;
            }
            sbList.add(tempSb.substring(startIndex, startIndex + i1));
            startIndex += i1;
        }

        return sbList;
    }

    public static void main(String[] args) {
        KaKao4 kaKao4 = new KaKao4();
        String str = "abaaba";
        kaKao4.solution(str);
    }
}
