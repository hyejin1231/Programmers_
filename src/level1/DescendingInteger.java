package level1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 프로그래머스 Lv1. 정수 내림차순 배치하기
 */
public class DescendingInteger
{
	public static void main(String[] args)
	{
		DescendingInteger descendingInteger = new DescendingInteger();
		long solution = descendingInteger.solution(118372);
		System.out.println("solution = " + solution); // 873211
	}
	
	public long solution(long n) {
		ArrayList<Long> list = new ArrayList<>();
		
		while (n != 0)
		{
			list.add(n % 10);
			n /= 10;
		}
		
		Object[] objects = list.stream().sorted().toArray();
		
		String result = "";
		for (int i = objects.length-1; i >= 0; i--)
		{
			result += objects[i];
		}
		
		return Long.parseLong(result);
	}
	
	public long solution2(long n)
	{
		String[] split = String.valueOf(n).split("");
		Arrays.sort(split);
		
		StringBuilder sb = new StringBuilder();
		for (String s : split)
		{
			sb.append(s);
		}
		
		return Long.parseLong(sb.reverse().toString());
	}
}



















