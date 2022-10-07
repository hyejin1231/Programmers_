package level1;

import java.util.Arrays;

/**
 *  프로그래머스 Lv1.
 *  행렬의 덧셈
 */
public class Procession {
    public static void main(String[] args) {
        Procession procession = new Procession();
        int[][] arr1 = {{1, 2},{2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};

        int[][] result = procession.solution(arr1, arr2);
        for (int[] ints : result) {
            System.out.println("Arrays.toString(result) = " + Arrays.toString(ints));
        }
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[1].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
