package level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 프로그래머스 Lv1.
 * 두 개 뽑아서 더하기
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        int[] numbers = {2,1,3,4,1};
        int[] result = addTwoNumbers.solution(numbers);

        System.out.println("Arrays.toString(result) = " + Arrays.toString(result)); // result 2,3,4,5,6,7

        int[] numbers2 = {5, 0, 2, 7};
        int[] solution = addTwoNumbers.otherSolution(numbers2);
        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution)); // result [2,5,7,9,12]

    }

    public int[] solution(int[] numbers) {
        int[] answer;
        Set<Integer> set = new HashSet<>();
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i +1 ; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        answer = new int[set.size()];
        Object[] objects = set.toArray();
        Arrays.sort(objects);

        int index =0 ;
        for (Object object : objects) {
            answer[index] = (int) object;
            index++;
        }

        return answer;
    }

    public int[] otherSolution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }

        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
