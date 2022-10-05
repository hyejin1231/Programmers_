package level1;

/**
 *  프로그래머스 Lv1.
 *  수박수박수박수박수박수?
 */
public class Watermelon {

    public static void main(String[] args) {
        Watermelon watermelon = new Watermelon();
        String result = watermelon.otherSolution(3);
        System.out.println("result = " + result); // result = 수박수박
    }

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                sb.append("박");
            }else {
                sb.append("수");
            }
        }

        return sb.toString();
    }

    public String otherSolution(int n) {

        return new String(new char[n / 2 + 1]).replace("\0", "수박").substring(0, n);
    }
}
