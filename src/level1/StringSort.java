package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        StringSort stringSort = new StringSort();
        String[] strings = {"sun", "bed", "car"};

        String[] result = stringSort.solution(strings, 1);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result)); // result ["car", "bed", "sun"]
    }

    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arrayList = new ArrayList<>();


        for (String s : answer) {
            char c = s.charAt(n);

        }

        return answer;
    }
}
