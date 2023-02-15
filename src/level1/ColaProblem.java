package level1;

/**
 * 프로그래머스 Lv1. 콜라문제
 */
public class ColaProblem
{
	public static void main(String[] args)
	{
		ColaProblem colaProblem = new ColaProblem();
		int result = colaProblem.solution(2, 1, 20);
		System.out.println("result = " + result); // result 19

		int result2 = colaProblem.solution(3, 1, 20);
		System.out.println("result2 = " + result2);// 9
		int result3 = colaProblem.solution(3, 2, 20);
		System.out.println("result3 = " + result3); // 36
	}
	
	public int solution(int a, int b, int n) {
		int answer = 0;
		
		while(n >= a)
		{
			int cola = n - (a * (n / a)) + (n / a) * b ;
			answer += (n / a) * b;
			n = cola;
		}
		
		return answer;
	}
}
