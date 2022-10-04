package level1;

/**
 * 프로그래머스 Lv1.
 * 나머지가 1이 되는 수 찾기
 */
public class Rest1 {

    public static void main(String[] args) {
        Rest1 rest1 = new Rest1();
        int result = rest1.solution(10);
        System.out.println("result = " + result); // result = 3
    }

    public int solution(int n) {
        int i;
        for (i = 1; i < n; i++) {
            if (n % i == 1) {
                break;
            }
        }
        return i;
    }
}
