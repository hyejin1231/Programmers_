package level1;

/**
 * 프로그래머스 Lv1.
 * 삼총사
 */
public class ThreeMusketeers {
    public static void main(String[] args) {
        ThreeMusketeers threeMusketeers = new ThreeMusketeers();
        int[] number = {-2, 3, 0, 2, -5};
        int result = threeMusketeers.solution(number);
        System.out.println("result = " + result);// result 2

        int[] number2 = {-3, -2, -1, 0, 1, 2, 3};
        int result2 = threeMusketeers.solution(number2);
        System.out.println("result2 = " + result2); // result 5

        int[] number3 = {-1, 1, -1, 1};
        int result3 = threeMusketeers.solution(number3);
        System.out.println("result3 = " + result3); // result 0
    }

    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++) {
            if (i + 2 > number.length) break;
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    int sum = number[i] + number[j] + number[k];
                    if (sum == 0) {
                        answer ++;
                    }
                }
            }
        }

        return answer;
    }
}
