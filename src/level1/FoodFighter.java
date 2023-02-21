package level1;

/**
 * 프로그래머스 Lv1.
 * 푸드 파이터
 */
public class FoodFighter
{
	public static void main(String[] args)
	{
		FoodFighter foodFighter = new FoodFighter();
		String result = foodFighter.otherSolution(new int[] { 1, 3, 4, 6 });
		System.out.println("result = " + result); // result  "1223330333221"
	}
	
	public String solution(int[] food) {
		StringBuffer sb = new StringBuffer();
		
		for (int i = 1; i < food.length; i++)
		{
			if (food[i] % 2 == 1)
			{
				food[i] -= 1;
			}
			
			for (int j = food[i] / 2; j > 0; j--)
			{
				sb.append(i);
			}
		}
		
		String answer = sb.toString();
		answer += "0";
		
		StringBuffer reverse = sb.reverse();
		answer += reverse;
		
		return answer;
	}
	
	public String otherSolution(int[] food)
	{
		String answer = "0";
		
		for (int i = food.length - 1; i > 0; i--)
		{
			for (int j = 0; j < food[i] / 2; j++)
			{
				answer = i + answer + i;
			}
			
		}
		
		return answer;
	}
}
