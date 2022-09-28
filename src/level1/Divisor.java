package level1;

/**
 * 프로그래머스 Lv1.
 * 약수의 합
 */
public class Divisor {

    public static void main(String[] args) {
        Divisor divisor = new Divisor();
        int result = divisor.MySolution(12);
        System.out.println("result = " + result); // result = 28
    }

    public int MySolution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) answer += i;
        return answer;
    }
}
