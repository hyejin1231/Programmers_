package level1;

/**
 * 프로그래머스 Lv1.
 * 음양 더하기
 */
public class Absolute {
    public static void main(String[] args) {
        Absolute absolute = new Absolute();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        int result = absolute.solution(absolutes, signs);
        System.out.println("result = " + result); // result 9


    }

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer = (signs[i]) ? answer + absolutes[i] : answer - absolutes[i];
        }

        return answer;
    }
}
