package level1;

import java.util.stream.IntStream;

/**
 * 프로그래머스 Lv1.
 * 내적
 */
public class DotProduct {

    public static void main(String[] args) {
        DotProduct dotProduct = new DotProduct();
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        int result = dotProduct.otherSolution(a, b);
        System.out.println("result = " + result); // result 3
    }

    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

    /**
     * IntStream
     * 스트림 api는 박싱 비용을 피할 수 있도록 IntStream, DoubleStream, LongStream을 제공
     */
    public int otherSolution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(i -> a[i] * b[i]).sum();
    }
}
















