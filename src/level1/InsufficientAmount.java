package level1;

/**
 * 프로그래머스 Lv1.
 * 부족한 금액 계산하기
 */
public class InsufficientAmount {
    public static void main(String[] args) {
        InsufficientAmount insufficientAmount = new InsufficientAmount();
        long result = insufficientAmount.solution(3, 20, 4);
        System.out.println("result = " + result); // result = 10
    }

    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            answer +=  price * i;
        }

        if (answer > money) {
            return answer - money;
        }else {
            return 0;
        }

    }
}
