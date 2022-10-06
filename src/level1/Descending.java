package level1;

import java.util.Arrays;
import java.util.Collections;

/**
 * 프로그래머스 Lv1.
 * 문자열 내림차순으로 배치하기
 * 대문자는 소문자보다 작은 것으로 인식
 */
public class Descending {
    public static void main(String[] args) {
        Descending descending = new Descending();
        String result = descending.otherSolution("Zbcdefg");
        System.out.println("result = " + result); // result = gfedcbZ

    }


    public String solution(String s) {
        String[] split = s.split("");
        Arrays.sort(split, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s1 : split) {
            sb.append(s1);
        }

        return sb.toString();
    }

    public String otherSolution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        return new StringBuilder(new String(chars)).reverse().toString();
    }
}
