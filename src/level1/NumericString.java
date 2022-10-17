package level1;

/**
 *  프로그래머스 Lv1.
 *  숫자 문자열과 영단어
 */
public class NumericString {
    public static void main(String[] args) {
        NumericString numericString = new NumericString();
        int result = numericString.solution("one4seveneight");
        System.out.println("result = " + result); // result 1478

        int result2 = numericString.solution("23four5six7");
        System.out.println("result2 = " + result2); // result2 234567

        int result3 = numericString.solution("123");
        System.out.println("result3 = " + result3); // result3 123


    }

    public int solution(String s) {
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven" , "eight", "nine"};

        for (int i = 0; i < word.length; i++) {
                s = s.replace(word[i], i + "");
        }

        return Integer.parseInt(s);
    }

}
