package level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * 프로그래머스 Lv1.
 * 폰켓몬
 */
public class Pokemon
{
	public static void main(String[] args)
	{
		Pokemon pokemon = new Pokemon();
		int[] nums = {3,1,2,3};
		int result = pokemon.otherSolution(nums);
		System.out.println("result = " + result); // result 2
		
		int[] nums2 = {3,3,3,2,2,4};
		int result2 = pokemon.otherSolution(nums2);
		System.out.println("result2 = " + result2); // result 3
		
		int[] nums3 = {3,3,3,2,2,2};
		int result3 = pokemon.otherSolution(nums3);
		System.out.println("result3 = " + result3); // result 2
		
	}
	
	public int solution(int[] nums) {
		
		int[] ints = Arrays.stream(nums).distinct().toArray();
		if (ints.length > nums.length / 2) {
			return nums.length / 2;
		}else {
			return ints.length;
		}
		
	}
	
	public int otherSolution(int[] nums)
	{
		HashSet<Integer> map = Arrays.stream(nums).boxed()
				.collect(Collectors.toCollection(() -> new HashSet()));
		
		return Math.min(map.size(), nums.length / 2);
		
	}
}
