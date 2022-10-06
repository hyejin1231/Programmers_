package level1;

/**
 * 프로그래머스 Lv1.
 * 문자열 다루기 기본
 */
public class BasicString {
    public static void main(String[] args) {
        BasicString basicString = new BasicString();
        boolean result1 = basicString.solution("a234");
        boolean result2 = basicString.solution("1234");
        System.out.println("result1 = " + result1); // result = false
        System.out.println("result2 = " + result2); // result = true
    }

    public boolean solution(String s) {

        char[] chars = s.toCharArray();
        if (chars.length == 4 || chars.length == 6) {
            for (char aChar : chars) {
                if (aChar >= '0' && aChar <= '9') {
                }else {
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }

    }
}

















