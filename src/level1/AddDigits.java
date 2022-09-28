package level1;

/**
 * 프로그래머스 Lv1.
 * 자릿수 더하기
 */
public class AddDigits {
    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        int result = addDigits.OtherSolution(123);
        System.out.println("result = " + result); // result = 6
    }

    public int MySolution(int n) {
        int answer = 0;

        String[] split = String.valueOf(n).split("");
        for (String s : split) {
            answer += Integer.valueOf(s);
        }

        return answer;
    }

    public int OtherSolution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
