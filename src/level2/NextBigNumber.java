package level2;

/**
 * 프로그래머스 Lv2.
 * 다음 큰 숫자
 */
public class NextBigNumber {
    public static void main(String[] args) {
        NextBigNumber bigNumber = new NextBigNumber();
        int result = bigNumber.solution(78);
        System.out.println("result = " + result); // result 83
    }

    public int solution(int n) {
        int length = Integer.toBinaryString(n).replace("0", "").length();

        while (true) {
            n++;
            if (length == Integer.toBinaryString(n).replace("0", "").length()) {
                break;
            }
        }

        return n;
    }
}
