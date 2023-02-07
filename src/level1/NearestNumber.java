package level1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 프로그래머스 Lv1. 가장 가까운 같은 글자
 */
public class NearestNumber
{
	public static void main(String[] args)
	{
		NearestNumber number = new NearestNumber();
		int[] result = number.solution("banana");
		System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
		
		int[] foobars = number.solution("foobar");
		System.out.println(
				"Arrays.toString(foobars) = " + Arrays.toString(foobars));
	}
	
	
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		
		HashMap<String, Integer> map = new HashMap<>();
		String[] split = s.split("");
		
		for (int i = 0; i< split.length; i++)
		{
			Integer integer = map.get(split[i]);
			if (integer == null) {
				answer[i] = -1;
			}else {
				answer[i] = i - integer;
			}
			map.put(split[i], i);
		}
		return answer;
	}
	
	public int[] otherSolution(String s)
	{
		int[] answer = new int[s.length()];
		
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i =0; i< s.length(); i++)
		{
			char c = s.charAt(i);
			answer[i] = i - map.getOrDefault(c, i + 1);
			map.put(c, i);
		}
		
		return answer;
	}
}
