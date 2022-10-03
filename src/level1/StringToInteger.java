package level1;

/**
 * 프로그래머스 Lv1.
 * 문자열을 정수로 바꾸기
 */
public class StringToInteger {
    public static void main(String[] args) {
        StringToInteger stringToInteger = new StringToInteger();
        int result = stringToInteger.solution("-1234");
        System.out.println("result = " + result);
    }

    public int solution(String s) {
        return Integer.parseInt(s);
    }
}
