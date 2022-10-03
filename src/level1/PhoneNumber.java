package level1;

/**
 * 프로그래머스 Lv1.
 * 핸드폰 번호 가리기
 */
public class PhoneNumber {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        String result = phoneNumber.solution("01033334444");
        System.out.println("result = " + result);
    }

    public String solution(String phone_number) {
        String substring = phone_number.substring(phone_number.length() - 4);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.append("*");
        }

        sb.append(substring);

        return sb.toString();

    }

    public String OtherSolution(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for (int i = 0; i < ch.length - 4; i++) {
            ch[i] = '*';
        }

        return String.valueOf(ch);
    }
}
