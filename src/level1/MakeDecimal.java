package level1;

import java.util.Arrays;

/**
 * 프로그래머스 Lv1.
 * 소수 만들기
 */
public class MakeDecimal {
    public static void main(String[] args) {
        MakeDecimal makeDecimal = new MakeDecimal();
        int[] nums = {1,2,3,4};
        int result = makeDecimal.solution(nums);
        System.out.println("result = " + result); // result 1

        int[] nums2 = {1,2,7,6,4};
        int result2 = makeDecimal.solution(nums2);
        System.out.println("result2 = " + result2); // result 4
    }

    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i + 2 >= nums.length) break;

            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isAnswer(sum)) {
                        answer ++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean isAnswer(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
