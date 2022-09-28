package level1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 프로그래머스 Lv1.
 * 자연수 뒤집어 배열로 만들기
 */
public class Backwards {

    public static void main(String[] args) {
        Backwards backwards = new Backwards();
        int[] result = backwards.MySolution(12345);
        for (int i : result) {
            System.out.print(i + " "); // 5, 4, 3, 2, 1
        }
    }


    public int[] MySolution(long n) {
        int[] answer;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (n != 0) {
            arrayList.add((int) (n % 10));
            n /= 10;
        }

        answer = new int[arrayList.size()];

        for (int j = 0; j < answer.length; j++) {
            answer[j] = arrayList.get(j);
        }

        return answer;
    }

    public int[] OtherSolution(long n) {
        int[] answer;
        String s = n + "";
        answer = new int[s.length()];

        int i = 0;
        while (n != 0) {
            answer[i] = (int) (n % 10);
            i ++;
            n /= 10;
        }

        return answer;
    }

}
