package level1;


/**
 * 프로그래머스 Lv1.
 * 없는 숫자 더하기
 */
public class NoNumber {
    public static void main(String[] args) {
        NoNumber noNumber = new NoNumber();
        int[] numbers = {1,2,3,4,6,7,8,0};
        int result = noNumber.solution(numbers);
        System.out.println("result = " + result); // result 14
    }

    public int solution(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return 45 - sum;
    }
}
