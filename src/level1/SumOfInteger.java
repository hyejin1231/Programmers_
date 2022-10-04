package level1;

/**
 * 프로그래머스 Lv1.
 * 두 정수 사이의 합
 */
public class SumOfInteger {

    public static void main(String[] args) {
        SumOfInteger sum = new SumOfInteger();
        long result = sum.mySolution(3, 3);
        System.out.println("result = " + result); // result = 12
    }

    public long mySolution(int a, int b) {
        long answer = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        for (int i = min; i <= max; i++) {
            answer += i;
        }

        return answer;
    }


}
