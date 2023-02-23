package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 프로그래머스 Lv1. 명예의 전당 (1)
 */
public class HallOfFame
{
	public static void main(String[] args)
	{
		HallOfFame hallOfFame = new HallOfFame();
		int[] result = hallOfFame.solution(3, new int[] { 10, 100, 20, 150, 1, 100, 200 });
		System.out.println("Arrays.toString(result) = " + Arrays.toString(result)); // result [10, 10, 10, 20, 20, 100, 100]

		int[] result2 = hallOfFame.otherSolution(4, new int[] { 0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 });
		System.out.println("Arrays.toString(result2) = " + Arrays.toString(result2)); // result [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
		
	}
	
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		int min = score[0];
		for (int i = 0; i< score.length; i++)
		{
			if (i < k) {
				arrayList.add(score[i]);
				min = Math.min(min, score[i]);
				answer[i] = min;
			}else {
				if (min < score[i]) {
					arrayList.add(score[i]);
					arrayList.remove(0);
					arrayList.sort(Integer::compareTo);
				}
				min = arrayList.get(0);
				answer[i] = arrayList.get(0);
			}
			arrayList.sort(Integer::compareTo);
			
		}
		
		return answer;
	}
	
	public int[] otherSolution(int k, int[] score) {
		int[] answer = new int[score.length];
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		for (int i = 0; i< score.length; i++)
		{
			priorityQueue.add(score[i]);
			
			if (priorityQueue.size() > k) {
				priorityQueue.poll();
			}
			answer[i] = priorityQueue.peek();
		}
		
		return answer;
	}
	
}
