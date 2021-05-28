package learn;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CountZeroSum {

	@Test
	public void test1() {
		int[] nums = { 2, -2, 3, 0, 4, -7 };
		System.out.println(getCountZeroSum(nums));
	}
	
	@Test
	public void test2() {
		int[] nums = { 2, -2, 3, 0, 4, -6 };
		System.out.println(getCountZeroSum(nums));
	}

	public int getCountZeroSum(int[] nums) {
		int count = 0, sum = 0;

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (map.containsKey(sum)) {
				count += map.get(sum);
			}

			map.put(sum, map.getOrDefault(sum, 0) + 1);

		}

		return count;

	}

}
