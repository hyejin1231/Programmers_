package level1;

import java.util.Arrays;

/**
 * 프로그래머스 Lv1.
 * K번째 수
 */
public class KNumbers {
    public static void main(String[] args) {
        KNumbers kNumbers = new KNumbers();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };
        int[] result = kNumbers.solution(array, commands);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result)); // result [5,6,3]
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int index = commands[i][2];

            int[] ints = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(ints);
            answer[i] = ints[index-1];
        }

        return answer;
    }
}
