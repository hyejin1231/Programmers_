package level1;

/**
 * 프로그래머스 Lv1.
 * 크기가 작은 부분 문자열
 */
public class SmallSubString
{
	
	public static void main(String[] args)
	{
		SmallSubString smallSubString = new SmallSubString();
		int result = smallSubString.solution("3141592", "271");
		System.out.println("result = " + result); // result 2
		
		int result2 = smallSubString.solution("500220839878", "7");
		System.out.println("result2 = " + result2); // result 8

		int result3 = smallSubString.solution("10203", "15");
		System.out.println("result3 = " + result3); // result 3
	}
	
	public int solution(String t, String p) {
		int answer = 0;
		long intP = Long.parseLong(p);
		
		long[] ints = new long[t.length() - p.length() + 1];
		for (int i = 0; i< ints.length; i++)
		{
			ints[i] = Long.parseLong(t.substring(i, i + p.length()));
		}
		
		for (long anInt : ints)
		{
			if (anInt <= intP) {
				answer++;
			}
		}
		
		return answer;
	}
}
