package level2;

/**
 * 프로그래머스 Lv2.
 * 숫자의 표현
 */
public class NumberRepresentation {
    public static void main(String[] args) {
        NumberRepresentation numberRepresentation = new NumberRepresentation();
        int result = numberRepresentation.solution(15);
        System.out.println("result = " + result); // result 4
    }

    public int solution(int n) {
        int answer = 0;

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                } else if (sum > n) {
                    break;
                }
            }
            sum = 0;
        }

        return answer;
    }
}
