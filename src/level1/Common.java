package level1;

import java.util.Arrays;

/**
 * 프로그래머스 Lv1.
 * 최대공약와 최소공배수
 */
public class Common {
    public static void main(String[] args) {
        Common common = new Common();
        int[] solution = common.solution(2, 5);
        System.out.println(Arrays.toString(solution)); // [3, 12]


    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = Math.min(n, m);

        int god = 0;
        for (int i = 1; i <= min; i++) {
            if (n % i == 0 & m % i == 0) {
                god = i;
            }
        }

        answer[0] = god;
        answer[1] = n * m/ god;


        return answer;
    }

}
