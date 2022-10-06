package level1;

/**
 * 프로그래머스 Lv1.
 * 약수의 개수와 덧셈
 */
public class AddDivisor {
    public static void main(String[] args) {
        AddDivisor addDivisor = new AddDivisor();
        int result = addDivisor.solution(13, 17);
        System.out.println("result = " + result); // result = 43

    }

    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;

        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count ++;
                }
            }
            answer = (count % 2 ==0) ? answer +i : answer - i;
            count = 0;
        }

        return answer;
    }

}
