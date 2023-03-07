package level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 프로그래머스 Lv2.
 * 귤 고르기
 */
public class PackingTangerines
{
	public static void main(String[] args)
	{
		PackingTangerines packingTangerines = new PackingTangerines();
		int result = packingTangerines.solution(6, new int[] { 1, 3, 2, 5, 4, 5, 2, 3 });
		System.out.println("result = " + result); // result 3
		
		int result2 = packingTangerines.solution(4, new int[] { 1, 3, 2, 5, 4, 5, 2, 3 });
		System.out.println("result2 = " + result2); // result 2
		
	}
	
	public int solution(int k, int[] tangerine) {
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i : tangerine)
		{
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		
		List<Integer> collect = map.values().stream().sorted()
				.collect(Collectors.toList());
		
		for (int i = collect.size()-1; i >= 0; i--)
		{
			if (k > 0) {
				k -= collect.get(i);
				answer++;
			}
		}
		
		return answer;
	}
	
	public int otherSolution(int k, int[] tangerine)
	{
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i : tangerine)
		{
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		
		List<Integer> list = new ArrayList<>(map.keySet());
		list.sort(((o1, o2) -> map.get(o2) - map.get(o1)));
		
		for (Integer key : list)
		{
			if (k > 0) {
				k -= map.get(key);
				answer++;
			}
		}
		
		return answer;
	}
}
