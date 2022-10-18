package level2;

import java.util.Arrays;

/**
 * 프로그래머스 Lv2.
 * N개의 최소공배수
 */
public class LeastCommonMultiple {
    public static void main(String[] args) {
        LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();
        int[] arr = {2, 6, 8, 14};
        int result = leastCommonMultiple.solution(arr);
        System.out.println("result = " + result); // result 168

//        int[] arr2 = {17,34};
//        int result2 = leastCommonMultiple.solution(arr2);
//        System.out.println("result2 = " + result2);
    }

    public int solution(int[] arr) {
        Arrays.sort(arr);
        int number = arr[arr.length - 1];

        for (int i = 1; ; i++) {
            int temp = number * i;
            boolean flag = true;

            for (int j = 0; j < arr.length; j++) {
                if (temp % arr[j] != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) return temp;
        }
    }
}
