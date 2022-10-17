package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 프로그래머스 Lv2.
 * 영어 끝말잇기
 */
public class EngEndToEnd {
    public static void main(String[] args) {
        EngEndToEnd engEndToEnd = new EngEndToEnd();
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] result = engEndToEnd.solution(3, words);

        System.out.println("Arrays.toString(result) = " + Arrays.toString(result)); // result [3,3]

        String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize",
                "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        int[] result2 = engEndToEnd.solution(5, words2);

        System.out.println("Arrays.toString(result2) = " + Arrays.toString(result2)); // [0,0]

        String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};
        int[] result3 = engEndToEnd.solution(2, words3);
        System.out.println("Arrays.toString(result3) = " + Arrays.toString(result3)); // [1, 3]

        String[] words4 = {"land", "dream", "mom", "mom", "ror"};
        int[] result4 = engEndToEnd.solution(2, words4);
        System.out.println("Arrays.toString(result4) = " + Arrays.toString(result4)); // [2,2]


    }

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= 1) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                return answer;
            }

            if (i >= 1) {
                if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    return answer;
                }
            }

            if (list.contains(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                return answer;
            }

            list.add(words[i]);
        }
        return answer;
    }

    public int[] otherSolution(int n, String[] words) {
        int[] answer = new int[2];

        String now = words[0];
        char end = now.charAt(now.length()-1);

        int i;
        for (  i = 1; i < words.length; i++) {
             if (end != words[i].charAt(0)) {
                 answer[0] = i % n + 1;
                 answer[1] = i / n + 1;
                break;
             }
            end = words[i].charAt(words[i].length()-1);
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(words[i])) {
                    answer[0] = j % n + 1;
                    answer[1] = j / n + 1;
                    break;
                }else{

                }
            }
        }

        return answer;
    }
}
