package level1;

/**
 * 프로그래머스 Lv1.
 * 문자열 내 p와 y의 개수
 */
public class CountPy {

    public static void main(String[] args) {
        CountPy countpy = new CountPy();
        boolean result = countpy.OtherSolution("pPoooyY");
        System.out.println("result = " + result); // result = true
    }

    boolean MySolution(String s) {
        boolean answer = true;

        String[] split = s.toLowerCase().split("");

        int pCount = 0;
        int yCount = 0;
        for (String s1 : split) {
            if (s1.equals("p")) {
                pCount++;
            } else if (s1.equals("y")) {
                yCount++;
            }
        }

        if (pCount == yCount) {
            return answer;
        } else {
            return false;
        }

    }

    boolean OtherSolution(String s) {
        char[] chars = s.toLowerCase().toCharArray();

        int pCount = 0;
        int yCount = 0;

        for (char aChar : chars) {
            if (aChar == 'p') {
                pCount++;
            } else if (aChar == 'y') {
                yCount++;
            }
        }

        return (pCount == yCount) ?  true : false;
    }
}
