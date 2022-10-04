package level1;

import java.util.Arrays;

/**
 * 프로그래머스 Lv1.
 * 서울에서 김서방 찾기
 */
public class FindKim {
    public static void main(String[] args) {
        FindKim findKim = new FindKim();
        String[] seoul = {"Jane", "Kim"};
        String result = findKim.solution(seoul);
        System.out.println("result = " + result); // result = "김서방은 1에 있다"
    }

    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }

        return answer;
    }

    public String otherSolution(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 " + index + "에 있다";
    }
}
