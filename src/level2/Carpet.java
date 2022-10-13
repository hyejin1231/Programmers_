package level2;

import java.util.Arrays;

/**
 * 프로그래머스 Lv2.
 * 카펫
 */
public class Carpet {
    public static void main(String[] args) {
        Carpet carpet = new Carpet();
//        int[] solution = carpet.solution(10, 2);
//        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution)); // result [4,3]

        int[] solution1 = carpet.solution(50, 22);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // result [24, 3]
    }

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int square = brown + yellow;

        for (int i = 1; i <= square; i++) {
            int col = square / i;

            // brown이 yellow를 감싸고 있기 때문에 yellow는 각각 2줄씩 뺀다고 생각하면 된다.
            if ((i - 2) * (col - 2) == yellow) {
                answer[0] = i;
                answer[1] = col;
            }
        }

        return answer;
    }
}
