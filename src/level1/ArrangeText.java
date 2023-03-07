package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 프로그래머스 Lv1.
 * 문자 내마음대로 정렬하기
 */
public class ArrangeText
{
	public static void main(String[] args)
	{
		ArrangeText arrangeText = new ArrangeText();
//		String[] result = arrangeText.solution(
//				new String[] { "sun", "bed", "car" }, 1);
//		System.out.println("result = " + Arrays.toString(result)); // result = ["car", "bed", "sun"]
		
		String[] result2 = arrangeText.solution(
				new String[] { "abce", "abcd", "cdx" }, 2);
		System.out.println(
				"Arrays.toString(result2) = " + Arrays.toString(result2));
		
	}
	
	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		ArrayList<String> arrayList = new ArrayList<>();
		for (int i = 0; i < strings.length; i++)
		{
			arrayList.add(strings[i].charAt(n) + strings[i]);
		}
		
		Collections.sort(arrayList);
		
		for (int i = 0; i < answer.length; i++)
		{
			answer[i] = arrayList.get(i)
					.substring(1, arrayList.get(i).length());
		}
		
		return answer;
	}
}
