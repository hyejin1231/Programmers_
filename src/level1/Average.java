package level1;

import java.util.Arrays;

/**
 * 프로그래머스 Lv1
 * 평균 구하기
 */
public class Average {

    public static void main(String[] args) {
        Average average = new Average();
        int[] arr = {1, 2, 3, 4};
        double result = average.OtherSolution(arr);
        System.out.println("result = " + result);
    }

    public double MySolution(int[] arr) {
        double answer = 0;
        int length = arr.length;

        for (int i : arr) {
            answer += i ;
        }

        return answer/=length;
    }

    public double OtherSolution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}
