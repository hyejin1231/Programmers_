package level1;

/**
 * 프로그래머스 Lv1.
 * 이상한 문자 만들기
 */
public class WeirdCharacters {
    public static void main(String[] args) {
        WeirdCharacters weirdCharacters = new WeirdCharacters();
        String result = weirdCharacters.solution2("try hello world");
        System.out.println("result = " + result); // result TrY HeLlO WoRlD
    }

    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");
        int index = 0;

        for (String s1 : split) {
            index = s1.contains(" ") ? 0 : index +1;
            answer += index % 2 == 0 ? s1.toLowerCase() : s1.toUpperCase();
        }

        return answer;
    }

    public String solution2(String s) {
        StringBuilder sb = new StringBuilder();

        String[] split = s.split("");
        int index = 0;

        for (String s1 : split) {
            index = s1.contains(" ") ? 0 : index +1;
            if (index % 2 == 0) {
                sb.append(s1.toLowerCase());
            } else {
                sb.append(s1.toUpperCase());
            }
        }

        return sb.toString();
    }

    // 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수
    public String otherSolution(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) != ' ') {
                    sb.append(s.toUpperCase().charAt(i));
                }else {
                    sb.append(" ");
                }
            } else {
                if (s.charAt(i) != ' ') {
                    sb.append(s.toLowerCase().charAt(i));
                }else {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }

}
