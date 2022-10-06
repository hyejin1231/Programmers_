package level1;

import java.util.Arrays;

/**
 * 프로그래머스 Lv1.
 * 최댓값과 최솟값
 */
public class MaxMin {
    public static void main(String[] args) {
        MaxMin maxMin = new MaxMin();
        String result = maxMin.otherSolution("-4 -2 -1 -3");
        System.out.println("result = " + result); // result 1 4
    }

    public String solution(String s) {
        String[] s1 = s.split(" ");

        int min = Arrays.stream(s1).mapToInt(i -> Integer.parseInt(i)).min().getAsInt();
        int max = Arrays.stream(s1).mapToInt(i -> Integer.parseInt(i)).max().getAsInt();

        return min + " " + max;
    }

    public String otherSolution(String s) {
        String[] s1 = s.split(" ");
        int min, max;
        min = max = Integer.parseInt(s1[0]);

        for (int i = 0; i < s1.length; i++) {
            int num = Integer.parseInt(s1[i]);
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }

        return min + " " + max;
    }
}
