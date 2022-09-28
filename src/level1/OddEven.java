package level1;

public class OddEven {

    public static void main(String[] args) {
        OddEven oddEven = new OddEven();
        String result = oddEven.MySolution(3);
        System.out.println("result = " + result);
    }


    public String MySolution(int num) {
        if (num % 2 == 0) return "Even";
        else return "Odd";
    }

    public String OtherSolution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }


}
