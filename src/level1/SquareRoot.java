package level1;

/**
 * 프로그래머스 LV1.
 * 정수 제곱근 판별
 */
public class SquareRoot {

    public static void main(String[] args) {
        SquareRoot squareRoot = new SquareRoot();
        long result = squareRoot.MySolution(3);
        System.out.println("result = " + result); // result = 144
    }

    public long MySolution(long n) {
        long sqrt = (long) Math.sqrt(n);
        System.out.println("sqrt = " + sqrt);
        if (Math.pow(sqrt , 2 ) == n ) {
            return (long) Math.pow(sqrt + 1, 2);
        }else {
            return -1;
        }

    }
}
