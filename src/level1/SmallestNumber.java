package level1;

import java.util.*;

/**
 * 프로그래머스 Lv1.
 * 제일 작은 수 제거하기
 */
public class SmallestNumber {
    public static void main(String[] args) {
        SmallestNumber smallestNumber = new SmallestNumber();
//        int[] arr = {4, 3, 2, 1};
        int[] arr = {-10};
        int[] result = smallestNumber.solution(arr);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result)); // result = 4, 3, 2
    }

    public int[] solution(int[] arr) {
        if (arr.length == 0 || ( arr.length == 1&& arr[0] == 10)) {
            return new int[]{-1};
        }

        int[] result = new int[arr.length - 1];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            result[index++] = arr[i];
        }
        return result;

    }
}
