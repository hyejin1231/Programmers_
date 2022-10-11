package level2;

/**
 * 프로그래머스 Lv2.
 * 피보나치 수
 */
public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.solution(3);
        System.out.println("reuslt = " + result); // result = 2
    }

    //  F(n) = F(n-1) + F(n-2)
    public int solution(int n) {
        int[] num = new int[n + 1];

        num[0] = 0;
        num[1] = 1;

        for (int i = 2; i <= n; i++) {
            num[i] = num[i - 1] % 1234567 + num[i - 2] % 1234567;
        }

        return num[n] % 1234567;
    }

}
