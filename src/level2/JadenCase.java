package level2;

/**
 * 프로그래머스 Lv1.
 * JadenCase 문자열 만들기
 */
public class JadenCase {
    public static void main(String[] args) {
        JadenCase jadenCase = new JadenCase();
        String result = jadenCase.otherSolution("a   aa ");
        System.out.println("result = " + result); // result = 3people Unfollowed Me
    }

    public String solution(String s) {
        String answer = "";
        String[] split = s.toLowerCase().split("");
        boolean flag = true;

        for (String s1 : split) {
            answer += flag ? s1.toUpperCase() : s1;
            flag = s1.equals(" ") ? true : false;
        }

        return answer;
    }

    public String otherSolution(String s) {
        String[] s1 = s.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].equals("")) {
                String substring = s1[i].substring(0, 1).toUpperCase();
                String lastString = s1[i].substring(1);

                sb.append(substring);
                sb.append(lastString);

                if (i != s1.length - 1) {
                    sb.append(" ");
                }
            }else{
                sb.append(" ");
            }
        }

        if (s.lastIndexOf(" ") == s.length()-1) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
