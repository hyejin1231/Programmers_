package level1;

/**
 * 프로그래머스 Lv1.
 * 콜라츠 추측
 */
public class Colatz {

    public static void main(String[] args) {
        Colatz colatz = new Colatz();
        int result = colatz.MySolution(626331);
        System.out.println("result = " + result); // result = 8

    }

    public int MySolution(long num) {
        int answer = 0;

        if (num == 1) return 0 ;

        while (num != 1) {
            num = (num % 2 == 0) ? num / 2 : (num * 3) + 1;
            answer ++;

            if (answer > 500) {
                return -1;
            }
        }

        return answer;
    }
}
