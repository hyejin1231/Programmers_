package level1;

import java.util.Arrays;

/**
 * 프로그래머스 Lv1.
 * x만큼 간격이 있는 n개의 숫자
 */
public class XInterval {

    public static void main(String[] args) {
        XInterval xInterval = new XInterval();
        long[] result = xInterval.solution(2, 5);
        String s = Arrays.toString(result);
        System.out.println("s = " + s); // 2, 4, 6, 8, 10
    }

    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        for (int i = 1; i <= n; i++) {
            answer[i-1] = x * i;
        }

        return answer;
    }

}
