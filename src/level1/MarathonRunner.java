package level1;

import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스 Lv1.
 * 완주하지 못한 선수
 */
public class MarathonRunner
{
	public static void main(String[] args)
	{
		MarathonRunner marathonRunner = new MarathonRunner();
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		String result = marathonRunner.solution(participant, completion);
		System.out.println("result = " + result); // result = "leo"
		
		String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
		String result2 = marathonRunner.solution(participant2, completion2);
		System.out.println("result2 = " + result2); // result = "vinko"
		
		String[] participants3 = {"mislav", "stanko", "mislav", "ana"};
		String[] completion3 = {"stanko", "ana", "mislav"};
		String result3 = marathonRunner.solution(participants3, completion3);
		System.out.println("result3 = " + result3);
		
	}
	
	
	public String solution(String[] participant, String[] completion) {
		StringBuffer sb = new StringBuffer();
		Map<String, Integer> map = new HashMap<>();
		
		for (String s : participant)
		{
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		
		for (String s : completion)
		{
			map.put(s, map.get(s) - 1);
		}
		
		for (String s : map.keySet())
		{
			if (map.get(s) != 0) {
				sb.append(s);
			}
		}
		
		
		return sb.toString();
	}
}
