package level1;

/**
 * 프로그래머스 Lv1.
 * 3진법 뒤집기
 */
public class Ternary {
    public static void main(String[] args) {
        Ternary ternary = new Ternary();
        int result = ternary.solution(45);
        System.out.println("result = " + result); // result 7
    }

    public int solution(int n) {

        char[] chars = Integer.toString(n, 3).toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = chars.length-1; i >= 0; i--) {
            sb.append(chars[i]);
        }

        return Integer.parseInt(sb.toString(), 3);
    }
}
