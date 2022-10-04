package level1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 프로그래머스 Lv1.
 * 나누어 떨어지는 숫자 배열
 */
public class DivisibleArray {
    public static void main(String[] args) {
        DivisibleArray divisibleArray = new DivisibleArray();
        int[] arr = {5, 9, 7, 10};
        int[] arr2 = {3, 2, 6};
        int[] result = divisibleArray.solution(arr2, 10);
        System.out.println(Arrays.toString(result)); // [5, 10]
    }

    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                arrayList.add(i);
            }
        }


        if (arrayList.isEmpty()) {
            answer = new int[1];
            answer[0] = -1;
        }else {
            answer = new int[arrayList.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arrayList.get(i);
            }
        }

        Arrays.sort(answer);
        return answer;
    }
}
