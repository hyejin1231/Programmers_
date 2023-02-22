package level1;

import java.util.Arrays;

/**
 * 프로그래머스 Lv1. 과일 장수
 */
public class FruitSeller
{
	public static void main(String[] args)
	{
		FruitSeller fruitSeller = new FruitSeller();
		int result = fruitSeller.solution(3, 4,
											new int[] { 1, 2, 3, 1, 2, 3, 1 });
		System.out.println("result = " + result); // result 8
		
		int result2 = fruitSeller.solution(4, 3,
											new int[] { 4, 1, 2, 2, 4, 4, 4, 4,
													1, 2, 4, 2 });
		System.out.println("result2 = " + result2); // result 33
		
	}
	
	public int solution(int k, int m, int[] score) {
		int answer = 0;
		Arrays.sort(score);
		int length = score.length;
		
		for (int i = 1; i <= length / m; i++)
		{
			answer += score[ length - (i * m)] * m;
		}
		
		return answer;
	}
}
