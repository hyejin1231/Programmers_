package level2;

/**
 * 프로그래머스 Lv2.
 * 멀리뛰기
 */
public class LongJump
{
	public static void main(String[] args)
	{
		LongJump longJump = new LongJump();
		long result = longJump.solution(4);
		System.out.println("result = " + result); // result 5
	}
	
	public long solution(int n) {
		int[] dp = new int[2001];
		dp[1] = 1;
		dp[2] = 2;
		
		for (int i = 3; i < dp.length; i++)
		{
			dp[i] = dp[i-2] + dp[i-1] % 1234567;
		}
		
		return dp[n];
	}
}
