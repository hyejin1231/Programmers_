package level2;

import java.util.Stack;

/**
 * 프로그래머스 Lv1.
 * 올바른 괄호
 */
public class Bracket {
    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        boolean result = bracket.solution2("()()");
        System.out.println("result = " + result); // result = true

        boolean result2 = bracket.solution2("(())()");
        System.out.println("result2 = " + result2); // result2 = true

        boolean result3 = bracket.solution2(")()(");
        System.out.println("result3 = " + result3); // result3 = false
    }

    // 효율성 테스트에서 시간초과남
    boolean otherSolution(String s) {

        while (s.contains("()")) {
           s = s.replace("()", "");
        }

        return (s.isEmpty()) ? true : false;
    }

    boolean solution(String s) {
        boolean answer = false;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            }
            if (s.charAt(i) == ')') {
                count--;
            }

            if (count < 0) {
                break;
            }
        }

        if (count == 0) {
            answer = true;
        }

        return answer;
    }


    boolean solution2(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push('(');
            }
        }

        return stack.isEmpty();
    }

}
