package level1;

/**
 * 프로그래머스 Lv1.
 * 하샤드 수
 */
public class Hashad {
    public static void main(String[] args) {
        Hashad hashad = new Hashad();
        boolean result = hashad.MySolution(11);
        System.out.println("result = " + result); // result = true
    }

    public boolean MySolution(int x) {
        int y = x;
        int sum= 0;

        while (x != 0) {
            sum += (x % 10);
            x /= 10;
        }
        return ( y % sum == 0) ? true : false;

    }
}
