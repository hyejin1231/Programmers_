package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * 프로그래머스 Lv1.
 * 같은 숫자는 싫어
 */
public class Deduplication {
    public static void main(String[] args) {
        Deduplication deduplication = new Deduplication();
        int[] arr = {1,1,3,3,0,1,1};
        int[] result = deduplication.solution(arr);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result)); // result [1,3,0,1]

    }

    public int[] solution(int []arr) {
        int[] answer;
        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            if (stack.isEmpty()) {
                stack.push(i);
            }else {
                if (stack.peek() == i) {
                    stack.pop();
                    stack.push(i);
                }else {
                    stack.push(i);
                }
            }

        }

        answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }


        return answer;
    }

    public int[] otherSolution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        int preNum = 10;

        for (int i : arr) {
            if (preNum != i) {
                arrayList.add(i);
            }

            preNum = i;
        }

        answer = new int[arrayList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}
