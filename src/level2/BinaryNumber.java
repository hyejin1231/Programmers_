package level2;

import java.util.Arrays;

/**
 * 프로그래머스 Lv1.
 * 이진 변환 반복하기
 */
public class BinaryNumber {
    public static void main(String[] args) {
        BinaryNumber binaryNumber = new BinaryNumber();
        int[] solution = binaryNumber.solution("110010101001");
        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
    }

    public int[] solution(String s) {
        int[] answer = new int[2];

        int i = 1;
        while (!s.equals("1")){
            int length = s.replace("0", "").length();
            answer[0] = i++;
            answer[1] += s.length() - length;
            s = Integer.toBinaryString(length);

        }
        return answer;
    }
}
