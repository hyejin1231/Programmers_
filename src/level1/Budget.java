package level1;

import java.util.Arrays;

/**
 * 프로그래머스 Lv1.
 * 예산
 */
public class Budget {
    public static void main(String[] args) {
        Budget budget = new Budget();
        int[] d = {1,3,2,5,4};
        int[] d2 = {2, 2, 3, 3};
        int result = budget.solution(d, 9);
        int result2 = budget.solution(d2, 10);
        System.out.println("result = " + result); // result 3
        System.out.println("result2 = " + result2); // result 4
    }

    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i : d) {
            budget -= i;
            if (budget < 0) {
                break;
            }
            answer++;
        }

        return answer;
    }
}
