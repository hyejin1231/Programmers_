package level1;

/**
 * 프로그래머스 Lv1.
 * 가운데 글자 가져오기
 */
public class MiddleString {
    public static void main(String[] args) {
        MiddleString middleString = new MiddleString();
        String abcde = middleString.solution("abcde");
        String qwer = middleString.solution("qwer");
        System.out.println("abcde = " + abcde); // result c
        System.out.println("qwer = " + qwer); // result we
    }

    public String solution(String s) {

        int length = s.length();
       return (length % 2 == 0) ?  s.substring(length / 2 -1 , length / 2 + 1) :  s.substring(length / 2 , length / 2 + 1);


    }
}
