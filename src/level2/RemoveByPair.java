package level2;

import java.util.Stack;

/**
 * 프로그래머스 Lv2.
 * 짝지어 제거하기
 */
public class RemoveByPair {
    public static void main(String[] args) {
        RemoveByPair removeByPair = new RemoveByPair();
        int result = removeByPair.solution("baabaa"); // baabaa -> bb aa -> aa ->
        System.out.println("result = " + result); // result = 1

        int result2 = removeByPair.solution("cdcd");
        System.out.println("result2 = " + result2); // result 0

        int result3 = removeByPair.solution("");
        System.out.println("result3 = " + result3); // result 0
    }

    public int solution(String s)
    {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty()) {
                stack.push(chars[i]);
            }else if (stack.peek() == chars[i]){
                stack.pop();
            }else if (stack.peek() != chars[i]){
                stack.push(chars[i]);
            }
        }

        return (stack.isEmpty()) ? 1 : 0;
    }

}
