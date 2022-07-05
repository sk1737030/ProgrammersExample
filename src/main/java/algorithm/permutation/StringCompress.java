package algorithm.permutation;

/**
 * 문자열 압축 기본
 * aabbcccd -> 2a2b3cd
 */
public class StringCompress {
    public int solution(String s) {
        String temp = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;
            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (count > 1)
                    temp += count;
                temp += s.charAt(i);
                count = 0;
            }

        }

        System.out.println(temp);

        return 0;
    }

    public static void main(String[] args) {
        StringCompress tringCompress = new StringCompress();
        String str = "aabbcd";
        tringCompress.solution(str);
    }
}
