package level1;

/**
 * 프로그래머스 Lv1.
 * 시저 암호
 */
public class CaesarCipher {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        String result = caesarCipher.solution("AB", 1);
        System.out.println("result = " + result); // result BC

        String result2 = caesarCipher.solution("z", 1);
        System.out.println("result2 = " + result2); // result a

        String result3 = caesarCipher.solution("a B z", 4);
        System.out.println("result3 = " + result3); // result e F d

        String result4 = caesarCipher.solution("P", 20);
        System.out.println("result4 = " + result4); // result E
    }

    public String solution(String s, int n) {
        char[] chars = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            if (aChar != ' ') {
                int i = aChar + n;
                if (aChar >= 'A' && aChar <= 'Z') {
                    if (i > 90) {
                        i -= 26;
                    }
                } else if (aChar >= 'a' && aChar <= 'z') {
                    if (i > 122) {
                        i -= 26;
                    }
                }
                sb.append((char) i);
            }else {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String otherSolution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        n %= 26;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLowerCase(c)) {
                c = (char) ((c - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(c)) {
                c = (char) ((c - 'A' + n) % 26 + 'A');
            }

            sb.append(c);
        }
        return sb.toString();
    }
}
