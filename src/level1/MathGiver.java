package level1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 프로그래머스 Lv1. 모의고사
 */
public class MathGiver
{
	public static void main(String[] args)
	{
		MathGiver mathGiver = new MathGiver();
		int[] answer = {1,2,3,4,5};
		int[] result = mathGiver.solution(answer);
		System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
	}
	
	
	public int[] solution(int[] answers) {
		int[] score = new int[3];
		int[] user1 = { 1, 2, 3, 4, 5 };
		int[] user2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] user3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		for (int i = 0; i< answers.length; i++)
		{
			if (answers[i] == user1[i % user1.length]) score[0] ++;
			if (answers[i] == user2[i % user2.length]) score[1] ++;
			if (answers[i] == user3[i % user3.length]) score[2] ++;
		}
		
		int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
		
		ArrayList<Integer> list = new ArrayList<>();
		if (maxScore == score[0]) list.add(1);
		if (maxScore == score[1]) list.add(2);
		if (maxScore == score[2]) list.add(3);
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
