package level1;

import java.util.Arrays;

/**
 * 프로그래머스 Lv1.
 * 1차지도
 */
public class SecretMap
{
	public static void main(String[] args)
	{
		SecretMap secretMap = new SecretMap();
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] result = secretMap.solution(5, arr1, arr2);
		System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
		
	}
	
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		for (int i = 0; i < n; i++)
		{
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i])
					.replace("1", "#")
					.replace("0", " ");
			
			while (answer[i].length() < n)
			{
				answer[i] = ' ' + answer[i];
			}
			
		}
		
		return answer;
	}
}
