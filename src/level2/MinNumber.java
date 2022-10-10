package level2;

import java.util.Arrays;

/**
 * 프로그래머스 Lv2.
 * 최소값 만들기
 */
public class MinNumber {
    public static void main(String[] args) {
        MinNumber minNumber = new MinNumber();
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        int result = minNumber.solution(A, B);
        System.out.println("result = " + result); // result 29
    }

    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);


        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length-1 - i];
        }

        return answer;
    }
}
