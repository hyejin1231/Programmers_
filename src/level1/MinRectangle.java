package level1;

import java.util.Arrays;

/**
 * 프로그래머스 Lv1.
 * 최소 직사각형
 */
public class MinRectangle {
    public static void main(String[] args) {
        MinRectangle minRectangle = new MinRectangle();
        int[][] sizes = {
                {60,50},
                {30,70},
                {60,30},
                {80,40}
        };
        int result = minRectangle.solution(sizes);

        System.out.println("result = " + result); // result 4000
    }

    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        int i = 0;

        for (int[] size : sizes) {
           Arrays.sort(size);
            if (sizes[i][0] > width) {
                width = sizes[i][0];
            }
            if (sizes[i][1] > height) {
                height = sizes[i][1];
            }

            i++;
        }

        return width * height;
    }

    public int otherSolution(int[][] sizes) {
        int length = 0, height = 0;

        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(length, Math.min(card[0], card[1]));
        }

        return length * height;
    }
}
